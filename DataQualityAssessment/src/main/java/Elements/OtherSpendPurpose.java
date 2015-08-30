/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class OtherSpendPurpose extends DataElement {

	/**
	 * @param dataField
	 */
	public OtherSpendPurpose(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "OtherSpendPurpose";
	}

}
