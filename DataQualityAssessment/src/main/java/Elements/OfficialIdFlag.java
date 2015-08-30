/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class OfficialIdFlag extends DataElement {

	/**
	 * @param dataField
	 */
	public OfficialIdFlag(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "OfficialIdFlag";
		}

}
