/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class XBorderFlag extends DataElement {

	/**
	 * @param dataField
	 */
	public XBorderFlag(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "XBorderFlag";
	}

}
