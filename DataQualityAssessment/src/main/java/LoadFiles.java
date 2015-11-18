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

		//P1
		/*
		filesToLoad.add("CR_PortalMassUpload_PL_PH_132_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_PL_SZ_1013_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RO_AL_0190_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RO_PH_0088_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_AL_421_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_PH_1812_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_SZ_0433_Milestone3.xlsx");
		*/
		filesToLoad.add("Spend_PortalMassUpload_PL_PH_1614_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_PL_SZ_1013_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RO_AL_0247_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RO_PH_0920_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_AL_722_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_PH_5178_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_SZ_1267_Milestone3.xlsx");
		
		/*
		//P2
		filesToLoad.add("CR_PortalMassUpload_BG_AL_40_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_PH_3334_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_SZ_223_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SI_AL_003_Milestone3.xlsx");
		*/
		filesToLoad.add("Spend_PortalMassUpload_BG_AL_102_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_PH_098_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_SZ_412_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SI_AL_003_Milestone3.xlsx");

		/*
		//P3
		filesToLoad.add("CR_PortalMassUpload_BE_AL_033_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_BE_SZ_051_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NL_AL_058_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NL_PH_278_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NL_SZ_16_Milestone3.xlsx");
		*/
		filesToLoad.add("Spend_PortalMassUpload_BE_AL_082_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BE_PH_102_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BE_SZ_063_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NL_PH_5_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NL_SZ_34_Milestone3.xlsx");
			
		/*		
		//P4
		filesToLoad.add("CR_PortalMassUpload_AT_SZ_61.928_Milestone3.1.xlsx");
		filesToLoad.add("CR_PortalMassUpload_CZ_AL_15_Milestone3.1.xlsx");
		filesToLoad.add("CR_PortalMassUpload_GR_AL_355_Milestone3.1.xlsx");
		*/
		filesToLoad.add("Spend_PortalMassUpload_CZ_AL_15_Milestone3.1.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_CZ_PH_11_Milestone3.1.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_GR_AL_653_Milestone3.1.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_GR_PH_007_Milestone3.1.xlsx");

		/*
		//P7
		filesToLoad.add("CR_PortalMassUpload_DK_AL_011_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_DK_PH_051_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_FI_AL_002_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_FI_PH_050_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NO_AL_002_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SE_AL_027_Milestone3.xlsx");
		*/
		filesToLoad.add("Spend_PortalMassUpload_DK_AL_015_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_PH_137_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_SZ_135_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_AL_002_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_PH_118_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_SZ_043_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_IE_PH_454_Milestone 3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_AL_002_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_SZ_019_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SE_AL_030_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SE_SZ_126_Milestone3.xlsx");
		
		
		//===================================================================
		
		
		//P1
		/*
		filesToLoad.add("CR_PortalMassUpload_PL_PH_0132_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_PL_SZ_1013_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RO_AL_0190_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RO_PH_0088_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_AL_0295_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_PH_0059_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RU_SZ_0433_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_PL_PH_1614_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_PL_SZ_1013_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RO_AL_0247_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RO_PH_0920_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_AL_0622_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_PH_0115_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RU_SZ_1267_Milestone3.xlsx");		
/*
		//P2
		filesToLoad.add("CR_PortalMassUpload_BG_AL_40_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_SZ_223_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_AL_012_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_HR_PH_3334_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SI_AL_003_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BG_AL_102_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_SZ_412_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_AL_014_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_HR_PH_098_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SI_AL_003_Milestone3.xlsx");

		//P3
		filesToLoad.add("CR_PortalMassUpload_BE_AL_025_Milestone3.xlsx");
		//filesToLoad.add("CR_PortalMassUpload_BE_PH_051_Milestone3.xlsx");
		//filesToLoad.add("CR_PortalMassUpload_BE_SZ_051_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NL_AL_019_Milestone3.xlsx");
		//filesToLoad.add("CR_PortalMassUpload_NL_PH_192_Milestone3.xlsx");
		//filesToLoad.add("CR_PortalMassUpload_NL_SZ_16_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BE_AL_073_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_BE_PH_101_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_BE_SZ_063_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NL_AL_052_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_NL_PH_005_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_NL_SZ_34_Milestone3.xlsx");
			
		//P4 - part 1
		//filesToLoad.add("CR_PortalMassUpload_AT_SZ_62007_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_AT_SZ_366_Milestone3.xlsx");
		//filesToLoad.add("CR_PortalMassUpload_HU_PH_32727_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_HU_PH_554_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_CZ_AL_15_Milestone3.xlsx");
		//filesToLoad.add("CR_PortalMassUpload_GR_AL_335_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_AT_PH_564_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_CZ_AL_15_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_CZ_PH_11_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_GR_AL_629_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_GR_PH_007_Milestone3.xlsx");
		//P4 - part 2
		
		
		//P5
		filesToLoad.add("CR_PortalMassUpload_TR_AL_4521_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_TR_PH_1466_Milestone3.xlsx");
		*/
		filesToLoad.add("Spend_PortalMassUpload_TR_AL_692_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_TR_PH_5056_Milestone3.xlsx");
		
		
		//P6
		/*
		filesToLoad.add("CR_PortalMassUpload_ES_AL_1528_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_PT_AL_053_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_ES_SZ_26_Milestone3.xlsx");	

		*/
		filesToLoad.add("Spend_PortalMassUpload_ES_AL_2057_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_PT_AL_100_Milestone3.xlsx");
		//filesToLoad.add("Spend_PortalMassUpload_ES_SZ_14_Milestone3.xlsx");
		/*
		//P7
		filesToLoad.add("CR_PortalMassUpload_DK_AL_011_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_DK_PH_052_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_FI_AL_002_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_FI_PH_051_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NO_AL_002_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_NO_PH_057_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SE_AL_027_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SE_PH_042_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_AL_015_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_PH_137_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_DK_SZ_120_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_AL_002_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_PH_120_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_FI_SZ_43_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_IE_PH_757_Milestone 3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_AL_002_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_PH_088_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_NO_SZ_18_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SE_AL_030_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SE_PH_075_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SE_SZ_57_Milestone3.xlsx");
		
		//P8		 
		filesToLoad.add("CR_PortalMassUpload_BG_PH_198_Milestone3.3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_BG_PH_200_Milestone3.1.xlsx");
		filesToLoad.add("CR_PortalMassUpload_BG_PH_200_Milestone3.2.xlsx");
		filesToLoad.add("CR_PortalMassUpload_CY_PH_5_Milestone3.Dummy.xlsx");
		filesToLoad.add("CR_PortalMassUpload_EE_PH_8_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_IT_AL_152_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_LT_PH_7_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_LV_PH_8_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_MT_PH_40_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_RS_PH_10_Milestone3.xlsx");
		filesToLoad.add("CR_PortalMassUpload_SI_PH_11_MIlestone3.xlsx");
		*/
		filesToLoad.add("Spend_PortalMassUpload_BG_PH_182_Milestone3.3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BG_PH_200_Milestone3.1.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_BG_PH_201_Milestone3.2.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_CY_PH_5_Milestone3.Dummy.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_EE_PH_8_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_IT_AL_35_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_LT_PH_7_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_LV_PH_8_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_MT_PH_99_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_RS_PH_4_Milestone3.xlsx");
		filesToLoad.add("Spend_PortalMassUpload_SI_PH_9_MIlestone3.xlsx");
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
						System.out.println(f);
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
					for(int cn = 0; cn<132; cn++) 
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
						try {
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
							}}
						catch (Exception ee)
						{
							System.out.println("Error reading cell");
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
