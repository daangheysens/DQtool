/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PayeeName extends DataElement {

	/**
	 * @param dataField
	 */
	public PayeeName(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "PayeeName";
	}

}
