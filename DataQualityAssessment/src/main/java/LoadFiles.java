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

import Repository.*;

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
		String path = "/Users/Daan/Desktop/DQAssessment/";
		//Affiliates
		HashSet<String> filesToLoad = new HashSet<String>();
		//all filenames to be added here
		//filesToLoad.add("CR_PortalMassUpload_ES_AL_008_Milestone2.xlsx/"); 
		//filesToLoad.add("Spend_PortalMassUpload_NO_PH_036_Milestone2.xlsx/");
		//filesToLoad.add("CR_PortalMassUpload_RU_PH_Deadline1.xlsx/");
		filesToLoad.add("Spend_PortalMassUpload_RU_PH_Deadline1.xlsx/");
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
