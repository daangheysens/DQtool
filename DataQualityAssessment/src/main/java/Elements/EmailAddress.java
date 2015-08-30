/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class EmailAddress extends DataElement{

	/**
	 * 
	 */
	public EmailAddress(Object dataField) {
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "EmailAddress";	}

}
