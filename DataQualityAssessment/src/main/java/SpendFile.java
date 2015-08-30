/**
 * 
 */

import java.util.LinkedList;
import java.util.List;

import Repository.Affiliate;

/**
 * @author Daan
 *
 */
public class SpendFile extends LocalDataFile{
	
	private LinkedList<SpendRecord> records;
	
	public SpendFile(Affiliate affiliate)
	{
		super(affiliate);
	}
	
	public void addRecord(SpendRecord record)
	{
		records.add(record);
	}
	
}
