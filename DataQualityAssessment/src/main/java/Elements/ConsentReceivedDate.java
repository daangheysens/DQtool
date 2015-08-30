/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ConsentReceivedDate extends DataElement {

	/**
	 * @param dataField
	 */
	public ConsentReceivedDate(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = true;
		this.lov = false;
		this.elementName = "ConsentReceivedDate";	
	}

}
