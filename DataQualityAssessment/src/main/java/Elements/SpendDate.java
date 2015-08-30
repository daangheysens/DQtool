/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class SpendDate extends DataElement {

	/**
	 * @param dataField
	 */
	public SpendDate(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = true;
		this.lov = false;
		this.elementName = "SpendDate";
	}

}
