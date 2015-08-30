/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class SpendAmount extends DataElement {

	/**
	 * @param dataField
	 */
	public SpendAmount(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "SpendAmount";
	}

}
