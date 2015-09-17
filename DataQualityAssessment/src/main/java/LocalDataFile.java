import java.util.LinkedList;

import Repository.Affiliate;

/**
 * 
 */

/**
 * @author Daan
 *
 */
public abstract class LocalDataFile {

	/**
	 * 
	 */
	protected Affiliate affiliate;
	protected ErrorReport errorReport;
	protected LinkedList<DataRecord> records = new LinkedList<DataRecord>();
	
	public LocalDataFile(Affiliate aff) 
	{
		this.affiliate = aff;
	}
	
	public Affiliate getAffiliate()
	{
		return this.affiliate;
	}
	
	public ErrorReport getErrorReport()
	{
		return this.errorReport;
	}
	
	public void generateErrorReport()
	{
		this.setErrorReport(new ErrorReport(this));
	}
	
	public void setErrorReport(ErrorReport errorReport)
	{
		this.errorReport = errorReport;
	}
	
	public LinkedList<DataRecord> getRecords()
	{
		return this.records;
	}
	
	public void addRecord(DataRecord record)
	{
		this.records.add(record);
	}

}
