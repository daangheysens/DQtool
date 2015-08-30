/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class CRMEventId extends DataElement {

	/**
	 * @param dataField
	 */
	public CRMEventId(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "CRMEventId";
	}

}
