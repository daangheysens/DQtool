/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class AddressType extends DataElement{

	/**
	 * 
	 */
	public AddressType(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "AddressType";
	}
	
	

}
