/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class NovartisContact extends DataElement {

	/**
	 * @param dataField
	 */
	public NovartisContact(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "NovartisContact";
	}

}
