/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class RelationType extends DataElement {

	/**
	 * @param dataField
	 */
	public RelationType(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "RelationType";
	}
}
