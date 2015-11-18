/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class MiddleName extends DataElement{

	/**
	 * 
	 */
	public MiddleName(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "MiddleName";
	}

}
