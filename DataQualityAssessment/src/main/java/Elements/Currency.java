/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Currency extends DataElement {

	/**
	 * @param dataField
	 */
	public Currency(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "Currency";
	}

}
