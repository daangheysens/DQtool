/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PaymentNote extends DataElement {

	/**
	 * @param dataField
	 */
	public PaymentNote(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "PaymentNote";
	}

}
