import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
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

		/*
		//CHECK SPEND - CR link
		for (LocalDataFile ldf : files)
		{
			if (ldf instanceof SpendFile)
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
				       //loop ends
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
						       if (fileToCheck.getLocalCRID1().getData().toString() == localcrid)
						       {
						    	   foundId = true;	 
						       }
						       else if (fileToCheck.getLocalCRID2().getData().toString() == localcrid)
						       {
						    	   foundId = true;	 
						       }
						       else if (fileToCheck.getLocalCRID3().getData().toString() == localcrid)
						       {
						    	   foundId = true;	 
						       }
						       //loop ends
							}

						    if (!foundId)
						    {
						    	ErrorRecord error = new ErrorRecord(412, ldf.getAffiliate(),
										record.getLocalCRID().getName(),
										record.getLocalCRID().getData().toString());
						    	ldf.getErrorReport().getErrors().add(error);
						    }
				    	}
				    }

				}
			}
		}
		 */


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
					writer.append(",," + type + ",prtl," + f.getRecords().size() + ",," 
							+ f.getAffiliate().getAffiliateName() + ",," + 
							f.getErrorReport().getRejectedRecords() + '\n');
				
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

					LinkedList<ErrorRecord> toPrint = f.getErrorReport().getErrors();
					if(toPrint != null)
					{
						for (ErrorRecord rec : toPrint)
						{
							writer.append("Id,prtl," + rec.getAffiliate().getCountry() + "," + div
									+ "," + getRepository().getErrorDescription(rec.getErrorCode()) + "," +
									rec.getErrorCode() + "," + rec.getErrColumnName() + "," + rec.getErrColumnValue() +
									"," + type + '\n');
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

		//END MAIN
	}

	public static Repository getRepository()
	{
		return repo;
	}
}


