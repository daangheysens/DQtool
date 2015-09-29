import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Repository.Affiliate;
import Repository.Repository;

/**
 * @author Daan
 *
 */
public class LoadFiles {

	private HashSet<LocalDataFile> files = new HashSet<LocalDataFile>();
	private Repository repo;

	
	/**
	 * 
	 */
	public LoadFiles(Repository repo) 
	{
		this.repo = repo;

		//to provide std. filepath
		String path = "C:/Users/daan.gheysens/Desktop/DQAssessment/Input/";

		//Affiliates
		HashSet<String> filesToLoad = new HashSet<String>();
		//all filenames to be added here
		
		//============ ERRONEOUS
		
		
	
		//============= GOOD
		
		//Out of memory
		filesToLoad.add("CR_PortalMassUpload_AT_SZ_41864_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HU_PH_32728_Milestone2.xlsx");
		
		
		//FIXED FILES
		//ERROR values in Excel
		filesToLoad.add("Spend_PortalMassUpload_SE_PH_97_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_SZ_016_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_PH_145_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_SZ_050_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SE_SZ_050_Milestone2.xlsx");
		
		//Data Validation lists
		filesToLoad.add("Spend_PortalMassUpload_GR_PH_042_Deadline2.xlsx");
		
		//INCORRECT FILE SYNTAX
		filesToLoad.add("Spend_PortalMassUpload_PL_PH_204_Milestone2.xlsx");
		
		//FileNotFoundException
		//retired filesToLoad.add("CR_PortalMassUpload_PL_PH_117_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_PL_PH_999_Milestone2.xlsx");
		
		//NO ERROR
		filesToLoad.add("Spend_PortalMassUpload_AT_SZ_144_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_PH_031_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SI_AL_003_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_BE_PH_051_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_BE_SZ_5_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_BG_AL_024_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_CZ_AL_13_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_DK_AL_010_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_ES_AL_1491_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_FI_AL_002_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_GR_AL_13_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_AL_011.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_PH_031_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_SZ_062_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NL_PH_50_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NL_SZ_15_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NO_AL_002_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_PL_SZ_004_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_PT_AL_053_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RO_AL_127_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RO_PH_017_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_AL_210_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_PH_1468_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_SZ_395_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SE_AL_027_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SI_AL_003_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_TR_AL_200_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_TR_PH_999_Milestone2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_ES_SZ_614_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_AT_PH_259_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BE_PH_102_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BE_SZ_5_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BG_AL_063_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_CZ_AL_13_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_AL_015_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_PH_126_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_ES_AL_3205_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_ES_SZ_3_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_AL_002_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_SZ_002_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_GR_AL_16_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_AL_013.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_SZ_089_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HU_PH_910_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_IE_PH_319_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NL_PH_61_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NL_SZ_33_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_AL_002_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_PH_121_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_PL_SZ_004_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_PT_AL_100_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RO_AL_149_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_AL_316_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_PH_4058_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_SZ_395_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SE_AL_030_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_TR_AL_200_Milestone2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_TR_PH_999_Milestone2.xlsx");
		// ...
		// ...
		// ...
		 
		//Load all
		try
		{

			for (String f : filesToLoad)
			{
				StringBuilder buildPath = new StringBuilder();
				buildPath.append(path);
				buildPath.append(f);

				StringBuilder affName = new StringBuilder();

				if (f.substring(0,1).matches("C"))
				{
					try
					{
						affName.append(f.substring(20,22));
						affName.append(f.substring(23,25));
						if (this.repo.searchAffiliate(affName.toString()) != null)
						{
							files.add(this.loadCRs(buildPath.toString(), 
									this.repo.searchAffiliate(affName.toString())));
						}
						else
						{
							System.out.println(f + " is an invalid filename");
						}

					}
					catch (Exception ex)
					{
						ex.printStackTrace();
						System.out.println("Error loading CRs");
					}
				}
				else if (f.substring(0,1).matches("S"))
				{
					try
					{
						affName.append(f.substring(23,25));
						affName.append(f.substring(26,28));

						Affiliate thisAffiliate = this.repo.searchAffiliate(affName.toString());

						if (thisAffiliate != null)
						{
							files.add(this.loadSpends(buildPath.toString(), this.repo.searchAffiliate(affName.toString())));
						}
						else
						{
							System.out.println(f + " is an invalid filename");
						}
					}
					catch (Exception ex)
					{
						System.out.println("Error loading spends");
					}
				}
			}
		}
		catch (Exception ex)
		{
			System.out.println("Fail in loads");
		}
	}


	//CRMASSUPLOAD
	private LocalDataFile loadCRs(String fileName, Affiliate affiliate) throws FileNotFoundException, IOException
	{	
		if (affiliate == null)
		{
			System.out.println("ttt");
			throw new IOException();
		}

		CRFile newFile = new CRFile(affiliate);

		File myFile = new File(fileName); 
		FileInputStream fis = new FileInputStream(myFile); 
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 

		// Return third sheet from the XLSX workbook 
		try 
		{
			XSSFSheet mySheet = myWorkBook.getSheetAt(2);
			Iterator ite = mySheet.rowIterator();
			ite.next();
			while(ite.hasNext())
			{
				try
				{
					Row row = (Row) ite.next();
					LinkedList<Object> newRec = new LinkedList<Object>();
					for(int cn = 0; cn<130; cn++) 
					{
						// If the cell is missing from the file, generate a blank one
						// (Works by specifying a MissingCellPolicy)
						Cell cell = row.getCell(cn, Row.CREATE_NULL_AS_BLANK);
						switch (cell.getCellType()) 
						{ 
						case Cell.CELL_TYPE_STRING: newRec.add(cell.getStringCellValue()); 
						break; 
						case Cell.CELL_TYPE_NUMERIC: newRec.add(cell.getNumericCellValue());
						break; 
						case Cell.CELL_TYPE_BOOLEAN: newRec.add(cell.getBooleanCellValue()); 
						break; 
						case Cell.CELL_TYPE_BLANK: newRec.add("");
						break;
						default : 
						} 
					}
					newFile.addRecord(new CRRecord(newRec, newFile));

				}
				catch (Exception ex)
				{
					System.out.println("Fix iterator");
					System.out.println(fileName);
				}

			}
			return newFile;
		}
		catch (Exception ex)
		{
			System.out.println("Invalid file syntax for " + fileName);
			throw new FileNotFoundException();
		}
	}

	//SPENDMASSUPLOAD
	private LocalDataFile loadSpends(String fileName, Affiliate affiliate) throws FileNotFoundException, IOException
	{
		if (affiliate == null)
		{
			System.out.println("ttt");
			throw new IOException();
		}

		SpendFile newFile = new SpendFile(affiliate);

		File myFile = new File(fileName); 
		FileInputStream fis = new FileInputStream(myFile); 
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 

		// Return third sheet from the XLSX workbook 
		try 
		{
			XSSFSheet mySheet = myWorkBook.getSheetAt(2);
			Iterator ite = mySheet.rowIterator();
			ite.next();
			while(ite.hasNext())
			{
				try
				{
					Row row = (Row) ite.next();
					LinkedList<Object> newRec = new LinkedList<Object>();
					for(int cn = 0; cn<80; cn++) 
					{
						// If the cell is missing from the file, generate a blank one
						// (Works by specifying a MissingCellPolicy)
						Cell cell = row.getCell(cn, Row.CREATE_NULL_AS_BLANK);
						switch (cell.getCellType()) 
						{ 
						case Cell.CELL_TYPE_STRING: newRec.add(cell.getStringCellValue()); 
						break; 
						case Cell.CELL_TYPE_NUMERIC: newRec.add(cell.getNumericCellValue());
						break; 
						case Cell.CELL_TYPE_BOOLEAN: newRec.add(cell.getBooleanCellValue()); 
						break; 
						case Cell.CELL_TYPE_BLANK: newRec.add("");
						break;
						default : 
						} 
					}
					newFile.addRecord(new SpendRecord(newRec, newFile));

				}
				catch (Exception ex)
				{
					System.out.println("Fix iterator");
					System.out.println(fileName);
				}

			}
			return newFile;
		}
		catch (Exception ex)
		{
			System.out.println("Invalid file syntax for " + fileName);
			throw new FileNotFoundException();
		}
	}

	public HashSet<LocalDataFile> getFiles()
	{
		return this.files;
	}


}
