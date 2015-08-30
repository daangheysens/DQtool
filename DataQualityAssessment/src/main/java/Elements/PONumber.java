/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PONumber extends DataElement {

	/**
	 * @param dataField
	 */
	public PONumber(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "PONumber";
	}

}
