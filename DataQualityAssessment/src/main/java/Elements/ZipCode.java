/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ZipCode extends DataElement {

	/**
	 * @param dataField
	 */
	public ZipCode(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "ZipCode";
	}
	
}
