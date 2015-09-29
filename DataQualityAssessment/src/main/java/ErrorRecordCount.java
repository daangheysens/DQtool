/**
 * 
 */

/**
 * @author daan.gheysens
 *
 */
public class ErrorRecordCount {

	private ErrorRecord errorRecord;
	private int errorCount;
	private String errorKey;
	
	public ErrorRecordCount(ErrorRecord errRec, String errKey)
	{
		this.errorRecord =  errRec;
		this.errorCount = 1;
		this.errorKey = errKey;
	}

	public ErrorRecord getErrorRecord() 
	{
		return errorRecord;
	}

	public int getErrorCount() 
	{
		return errorCount;
	}

	public void increaseErrorCount() 
	{
		this.errorCount++;
	}

	public String getErrorKey() 
	{
		return errorKey;
	}

}
