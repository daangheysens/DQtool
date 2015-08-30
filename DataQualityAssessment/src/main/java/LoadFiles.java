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
		filesToLoad.add("CR_PortalMassUpload_ES_AL_050_Milestone2.xlsx/"); 
		filesToLoad.add("Spend_PortalMassUpload_NO_PH_050_Milestone2.xlsx/");
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
						files.add(this.loadCRs(buildPath.toString(), this.repo.searchAffiliate(affName.toString())));
						System.out.println("File added");

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
						
						files.add(this.loadSpends(buildPath.toString(), this.repo.searchAffiliate(affName.toString())));
						System.out.println("File added");
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
		CRFile newFile = new CRFile(affiliate);

		File myFile = new File(fileName); 
		FileInputStream fis = new FileInputStream(myFile); 
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 

		// Return third sheet from the XLSX workbook 
		XSSFSheet mySheet = myWorkBook.getSheetAt(2);
		for(int rowNr = 1; rowNr < 51; rowNr++) 
		{	
			Row row = mySheet.getRow(rowNr);
			LinkedList<Object> newRec = new LinkedList<Object>();
			for(int cn=0; cn<130; cn++) 
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
		return newFile;
	}

	//SPENDMASSUPLOAD
	private LocalDataFile loadSpends(String fileName, Affiliate affiliate) throws FileNotFoundException, IOException
	{
		SpendFile newFile = new SpendFile(affiliate);

		File myFile = new File(fileName); 
		FileInputStream fis = new FileInputStream(myFile); 
		XSSFWorkbook myWorkBook = new XSSFWorkbook (fis); 

		// Return third sheet from the XLSX workbook 
		XSSFSheet mySheet = myWorkBook.getSheetAt(2);
		for(int rowNr = 1; rowNr < 51; rowNr++) 
		{	
			Row row = mySheet.getRow(rowNr);
			LinkedList<Object> newRec = new LinkedList<Object>();
			for(int cn=0; cn<80; cn++) 
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
		return newFile;
	}

	public HashSet<LocalDataFile> getFiles()
	{
		return this.files;
	}


}
