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
	protected int rejectedRecords = 0;
	
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
	
	public void setRejectedRecords()
	{
		this.rejectedRecords = 0;
		for(DataRecord d : this.records)
		{
			if (!d.isLoaded())
			{
				this.rejectedRecords++;
			}
		}
	}
	
	public int getRejectedRecords()
	{
		return this.rejectedRecords;
	}
	
	

}
