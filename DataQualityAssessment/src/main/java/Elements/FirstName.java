/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class FirstName extends DataElement{

	/**
	 * 
	 */
	public FirstName(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "FirstName";
	}

}
