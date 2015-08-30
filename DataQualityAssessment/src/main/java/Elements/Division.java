/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Division extends DataElement {

	/**
	 * @param dataField
	 */
	public Division(Object dataField) 
	{
		super(dataField.toString());
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "Division";
	}

}
