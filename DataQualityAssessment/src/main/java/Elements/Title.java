/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Title extends DataElement {

	/**
	 * @param dataField
	 */
	public Title(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "Title";	
	}

}
