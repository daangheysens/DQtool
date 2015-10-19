import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import Repository.Repository;


/**
 * 
 */

/**
 * @author Daan
 *
 */
public class Run {

	//check necessity of this
	private static final Repository repo = new Repository();

	/**
	 * @param args
	 * @throws FileNotFoundException, IOException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		boolean generateErrReport = true;
		boolean tErrAudit = true;
		boolean tFileMonitor = true;


		//LOAD FILES
		LoadFiles load = new LoadFiles(repo);
		if (load.getFiles() == null)
			System.out.println("files kept in LoadFiles are empty");
		HashSet<LocalDataFile> files = load.getFiles();


		//GENERATE ERROR REPORTS
		if (generateErrReport)
		{
			for (LocalDataFile ldf : files)
			{
				ldf.generateErrorReport();
			}
		}
		
		//CHECK SPEND - CR link
		for (LocalDataFile ldf : files)
		{
			try 
			{
				SpendFile spendFile = (SpendFile) ldf;
				if (repo.getIntegrationAffiliates().contains(spendFile.getAffiliate().getAffiliateName()))
				{
					boolean found = false;	
					LocalDataFile crFile = null;
					
					Iterator<LocalDataFile> it = files.iterator();

					while(it.hasNext() && !found)
					{
						LocalDataFile fileToCheck = it.next();
						if (fileToCheck.getAffiliate() == spendFile.getAffiliate())
						{
							if (fileToCheck instanceof CRFile)
							{
								crFile = fileToCheck;
								found = true;
							}	 
						}
						//loop ends - 
					}

					if (found)
					{
						for (DataRecord spend : spendFile.getRecords())
						{
							SpendRecord record = (SpendRecord) spend;
							String localcrid = record.getLocalCRID().getData().toString();
							boolean foundId = false;

							Iterator<DataRecord> ite = crFile.getRecords().iterator();

							while(ite.hasNext() && !foundId)
							{
								CRRecord fileToCheck = (CRRecord) ite.next();
								if (fileToCheck.getLocalCRID1().getData().toString().equals(localcrid))
								{
									foundId = true;	 
								}
								else if (fileToCheck.getLocalCRID2().getData().toString().equals(localcrid))
								{
									foundId = true;	 
								}
								else if (fileToCheck.getLocalCRID3().getData().toString().equals(localcrid))
								{
									foundId = true;	 
								}
							}

							if (!foundId)
							{
								String errKey = "412" + spendFile.getAffiliate().getAffiliateName() + 
										record.getLocalCRID().getName() + 
										record.getLocalCRID().getData().toString();
								if (spendFile.getErrorReport().getErrors().containsKey(errKey))
								{
									spendFile.getErrorReport().getErrors().get(errKey).increaseErrorCount();
								}
								else
								{
									ErrorRecord error = new ErrorRecord(412, spendFile.getAffiliate(),
											record.getLocalCRID().getName(), 
											record.getLocalCRID().getData().toString());
									spendFile.getErrorReport().getErrors().put(errKey, new ErrorRecordCount(error, errKey));
								}	
								record.didNotLoad();
							}
						}
					}
				}
			}
			catch (Exception ex)
			{
				//do nothing - not a spendfile
			}
		}
		
		//COUNT REJECTED RECORDS
				if (generateErrReport)
				{
					for (LocalDataFile ldf : files)
					{
						ldf.setRejectedRecords();
					}
				}

		

		//PRINT T_FILE_MONITOR EXRTRACT
		if (tFileMonitor)
		{
			String pathToStoreErrors = "C:/Users/daan.gheysens/Desktop/DQAssessment/Output/files.csv"; 
			FileWriter writer = new FileWriter(pathToStoreErrors);

			//
			try 
			{
				for (LocalDataFile f : files)
				{
					String type;
					try
					{
						CRFile test = (CRFile) f;
						type = "CR Master";
					}
					catch (Exception ex)
					{
						type = "Spend";
					}
					String div;
					if (f.getAffiliate().getDivision() == "11")
						div = "PH";
					else if (f.getAffiliate().getDivision() == "14")
						div = "SZ";
					else 
						div = "AL";

					//print file specifics
					writer.append(
							type + '\t'
							+ "prtl" + '\t' 
							+ f.getRecords().size() + '\t' 
							+ '\t'  
							+ f.getAffiliate().getCountry() + div + '\t' 
							+ '\t' 
							+ f.getRejectedRecords() + '\n');
				}
				writer.flush();
				writer.close();
			}
			catch (Exception ex)
			{
				System.out.println("Error in T_FILE_MONITOR extract");
			}
		}
		
		

		//PRINT T_ERR_AUDIT EXTRACT		
		if (tErrAudit)
		{
			String pathToStoreErrors = "C:/Users/daan.gheysens/Desktop/DQAssessment/Output/errors.csv"; 
			FileWriter writer = new FileWriter(pathToStoreErrors);
			try
			{
				for (LocalDataFile f : files)
				{
					String type;
					try
					{
						CRFile test = (CRFile) f;
						type = "T_CR";
					}
					catch (Exception ex)
					{
						SpendFile test = (SpendFile) f;
						type = "T_SPND";
					}

					String div;
					if (f.getAffiliate().getDivision() == "11")
						div = "PH";
					else if (f.getAffiliate().getDivision() == "14")
						div = "SZ";
					else 
						div = "AL";

					Collection<ErrorRecordCount> toPrint = f.getErrorReport().getErrors().values();
					if(toPrint != null)
					{
						for (ErrorRecordCount rec : toPrint)
						{
							writer.append(
											"prtl" + '\t'
											+ rec.getErrorRecord().getAffiliate().getCountry() + '\t' 
											+ div + '\t'
											+ getRepository().getErrorDescription(rec.getErrorRecord().getErrorCode()) + '\t' 
											+ rec.getErrorRecord().getErrorCode() + '\t' 
											+ rec.getErrorRecord().getErrColumnName() + '\t' 
											+ rec.getErrorRecord().getErrColumnValue() + '\t'
											+ type + '\t'
											+ rec.getErrorCount() + '\n');
						}
					}
				}
				writer.flush();
				writer.close();
			}
			catch (Exception ex)
			{
				System.out.println("Error in T_ERR_AUDIT extract");
			}
		}
		
		/*
		//total amount of spends
		if (tErrAudit)
		{
			String pathToStoreErrors = "C:/Users/daan.gheysens/Desktop/DQAssessment/Output/spendamounts.csv"; 
			FileWriter writer = new FileWriter(pathToStoreErrors);
			try
			{
				for (LocalDataFile f : files)
				{
					String type;
					try
					{
						CRFile test = (CRFile) f;
						type = "T_CR";
					}
					catch (Exception ex)
					{
						SpendFile test = (SpendFile) f;
						type = "T_SPND";
						
						String div;
						if (f.getAffiliate().getDivision() == "11")
							div = "PH";
						else if (f.getAffiliate().getDivision() == "14")
							div = "SZ";
						else 
							div = "AL";
						
						LinkedList<DataRecord> spendRecords = f.getRecords();
						
						for (DataRecord dataRec : spendRecords)
						{
							try
							{
								SpendRecord sp = (SpendRecord) dataRec;
								
								writer.append(
									sp.getAffiliate().getCountry() + '\t' 
									+ div + '\t'
									+ type + '\t'
									+ sp.getSpendAmount().getData().toString() + '\t' 
									+ sp.getSpendCurrency().getData().toString() + '\n');	
							}
							catch (Exception exc) {System.out.println("error in printing");}	
						}
					}
				}
				writer.flush();
				writer.close();
			}
			catch (Exception ex)
			{
				System.out.println("Error in total amount of spends extract");
			}
		}
		*/

		//END MAIN
	}

	public static Repository getRepository()
	{
		return repo;
	}
}


