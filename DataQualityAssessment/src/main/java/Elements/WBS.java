/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class WBS extends DataElement {

	/**
	 * @param dataField
	 */
	public WBS(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "WBS";
	}

}
