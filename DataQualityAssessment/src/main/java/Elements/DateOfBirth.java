/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class DateOfBirth extends DataElement{

	/**
	 * 
	 */
	public DateOfBirth(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = true;
		this.lov = false;
		this.elementName = "DateOfBirth";
	}

}
