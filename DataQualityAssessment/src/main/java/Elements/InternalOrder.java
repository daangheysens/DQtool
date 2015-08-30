/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class InternalOrder extends DataElement {

	/**
	 * @param dataField
	 */
	public InternalOrder(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "InternalOrder";
	}

}
