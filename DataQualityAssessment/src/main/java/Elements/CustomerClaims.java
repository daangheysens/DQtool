/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class CustomerClaims extends DataElement {

	/**
	 * @param dataField
	 */
	public CustomerClaims(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "CustomerClaims";
	}

}
