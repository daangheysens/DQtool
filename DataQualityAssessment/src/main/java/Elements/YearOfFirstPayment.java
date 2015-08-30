/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class YearOfFirstPayment extends DataElement {

	/**
	 * @param dataField
	 */
	public YearOfFirstPayment(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "YearOfFirstPayment";
	}

}
