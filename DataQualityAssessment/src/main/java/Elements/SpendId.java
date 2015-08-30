/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class SpendId extends DataElement {

	/**
	 * @param dataField
	 */
	public SpendId(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "SpendId";
	}

}
