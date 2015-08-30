/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class CRType extends DataElement {

	/**
	 * @param dataField
	 */
	public CRType(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "CRType";
	}
	
	public void setMandatory(boolean man)
	{
		this.mandatory = man;
	}

}
