/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class LastName extends DataElement{

	/**
	 * 
	 */
	public LastName(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "LastName";
	}

}
