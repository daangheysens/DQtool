/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ConsentId extends DataElement {

	/**
	 * @param dataField
	 */
	public ConsentId(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "ConsentID";
	}

}
