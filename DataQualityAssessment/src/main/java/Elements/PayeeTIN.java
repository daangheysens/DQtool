/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PayeeTIN extends DataElement {

	/**
	 * @param dataField
	 */
	public PayeeTIN(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "PayeeTIN";
	}

}
