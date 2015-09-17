/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Division extends DataElement {

	/**
	 * @param dataField
	 */
	public Division(Object dataField) 
	{	
		super(dataField);		
		try
		{
		if ((Double) dataField == 71)
			this.dataField = "71";
		else if ((Double) dataField == 14)
			this.dataField = "14";
		else if ((Double) dataField == 11)
			this.dataField = "11";
		}
		catch (Exception ex)
		{
			//invalid value
		}
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "Division";
	}

}
