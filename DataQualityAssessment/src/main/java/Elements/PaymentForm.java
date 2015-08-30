/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PaymentForm extends DataElement {

	/**
	 * @param dataField
	 */
	public PaymentForm(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "PaymentForm";
	}

}
