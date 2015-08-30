/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PaymentMethod extends DataElement {

	/**
	 * @param dataField
	 */
	public PaymentMethod(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "PaymentMethod";
	}

}
