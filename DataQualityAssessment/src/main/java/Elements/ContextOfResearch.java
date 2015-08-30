/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ContextOfResearch extends DataElement {

	/**
	 * @param dataField
	 */
	public ContextOfResearch(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "ContextOfResearch";
	}

}
