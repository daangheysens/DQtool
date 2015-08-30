/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class AddressLine extends DataElement {

	/**
	 * @param dataField
	 */
	public AddressLine(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "AddressLine1";
	}
	
	

}
