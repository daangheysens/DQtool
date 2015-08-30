/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Gender extends DataElement {

	/**
	 * @param dataField
	 */
	public Gender(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "Gender";
	}

}
