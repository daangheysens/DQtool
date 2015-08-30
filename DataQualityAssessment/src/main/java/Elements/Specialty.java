/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Specialty extends DataElement {

	/**
	 * @param dataField
	 */
	public Specialty(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false; //to check
		this.date = false;
		this.lov = true;
		this.elementName = "Specialty";
	}

}
