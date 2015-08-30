/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Brick extends DataElement {

	/**
	 * @param dataField
	 */
	public Brick(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "Brick";
	}

}
