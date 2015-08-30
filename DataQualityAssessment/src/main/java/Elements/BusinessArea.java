/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class BusinessArea extends DataElement {

	/**
	 * @param dataField
	 */
	public BusinessArea(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "BusinessArea";	
	}

}
