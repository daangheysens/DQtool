/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class IdType extends DataElement {

	/**
	 * @param dataField
	 */
	public IdType(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "IdType";
	}

	public void setMandatory(boolean man)
	{
		this.mandatory = man;
	}
}
