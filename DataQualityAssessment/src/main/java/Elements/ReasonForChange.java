/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ReasonForChange extends DataElement {

	/**
	 * @param dataField
	 */
	public ReasonForChange(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "ReasonForChange";	
	}
	
	public void setMandatory(boolean man)
	{
		this.mandatory = man;
	}

}
