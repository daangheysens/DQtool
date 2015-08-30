/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Counsel extends DataElement {

	/**
	 * @param dataField
	 */
	public Counsel(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false; //to check
		this.date = false;
		this.lov = true;
		this.elementName = "Counsel";
	}

}
