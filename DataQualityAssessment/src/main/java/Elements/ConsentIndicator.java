/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ConsentIndicator extends DataElement {

	/**
	 * @param dataField
	 */
	public ConsentIndicator(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "ConsentIndicator";
	}

}
