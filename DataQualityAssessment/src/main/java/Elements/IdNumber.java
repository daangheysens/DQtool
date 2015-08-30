/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class IdNumber extends DataElement {

	/**
	 * @param dataField
	 */
	public IdNumber(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "IdNumber";
	}
	
	public void setMandatory(boolean man)
	{
		this.mandatory = man;
	}

}
