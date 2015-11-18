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
		try 
		{
			double id = Double.parseDouble((String) dataField);
			this.dataField = id;
		}
		catch (Exception ex) {}
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "EventId";
	}

}
