/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class OrganizationName extends DataElement {

	/**
	 * @param dataField
	 */
	public OrganizationName(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "OrganizationName";
	}

}
