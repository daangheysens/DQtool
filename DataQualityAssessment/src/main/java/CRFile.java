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
public class CRFile extends LocalDataFile{
	
	private LinkedList<CRRecord> records = new LinkedList<CRRecord>();
	
	public CRFile(Affiliate affiliate)
	{
		super(affiliate);
	}
	
	public void addRecord(CRRecord record)
	{
		records.add(record);
	}
	
}
