/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class EventId extends DataElement {

	/**
	 * @param dataField
	 */
	public EventId(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "EventId";
	}

}
