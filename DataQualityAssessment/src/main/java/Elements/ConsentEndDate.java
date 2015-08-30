/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ConsentEndDate extends DataElement {

	/**
	 * @param dataField
	 */
	public ConsentEndDate(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = true;
		this.lov = false;
		this.elementName = "ConsentEndDate";
	}

}
