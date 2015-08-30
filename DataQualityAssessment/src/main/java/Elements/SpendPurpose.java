/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class SpendPurpose extends DataElement {

	/**
	 * @param dataField
	 */
	public SpendPurpose(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "SpendPurpose";
	}

}
