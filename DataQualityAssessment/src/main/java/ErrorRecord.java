import Repository.Affiliate;

/**
 * 
 */

/**
 * @author Daan
 *
 */
public class ErrorRecord {
	
	private int errorCode;
	private Affiliate affiliate;
	private String errColumnName;
	private String errColumnValue;
	
	
	public ErrorRecord(int errcd, Affiliate aff, String colnm, String colval)
	{
		this.errorCode = errcd;
		this.affiliate = aff;
		this.errColumnName = colnm;
		this.errColumnValue = colval;
	}
	
	public int getErrorCode()
	{
		return this.errorCode;
	}
	
	public Affiliate getAffiliate()
	{
		return this.affiliate;
	}
	
	public String getErrColumnName()
	{
		return this.errColumnName;
	}
	
	public String getErrColumnValue()
	{
		return this.errColumnValue;
	}
	

}
