import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import Elements.DataElement;
import Repository.*;


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
	private HashSet<LocalDataFile> dataFiles = new HashSet<LocalDataFile>();

	/**
	 * @param args
	 * @throws FileNotFoundException, IOException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		LoadFiles load = new LoadFiles(repo);
		if (load.getFiles() == null)
			System.out.println("files kept in LoadFiles are empty");
		HashSet<LocalDataFile> files = load.getFiles();

		//generate ErrorReport




		for (LocalDataFile ldf : files)
		{
			ldf.generateErrorReport();
		}

		/*
		for (LocalDataFile ldf : files)
		{
			try
			{
				CRFile blabla = (CRFile) ldf;
				for (CRRecord grrr : blabla.getRecords())
				{
					StringBuilder sb = new StringBuilder();
					for (DataElement dd : grrr.getFields())
					{
						sb.append(dd.getData().toString() + ", ");
					}
					System.out.println(sb.toString());
				}

			}
			catch (Exception ex)
			{
				System.out.println("did not work");
			}
		}*/

		try
		{
			for (LocalDataFile f : files)
			{
				LinkedList<ErrorRecord> toPrint = f.getErrorReport().getErrors();
				if(toPrint != null)
				{
					for (ErrorRecord rec : toPrint)
					{
						System.out.println(rec.getAffiliate().getAffiliateName());
						System.out.println(rec.getErrorCode());
						System.out.println(rec.getErrColumnName() + " - " + rec.getErrColumnValue());
					}
				}
			}
		}
		catch (Exception ex)
		{
			System.out.println("Error in Printing");
		}
	}

	public static Repository getRepository()
	{
		return repo;
	}



}


