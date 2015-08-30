/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class LinkageWithContract extends DataElement {

	/**
	 * @param dataField
	 */
	public LinkageWithContract(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "LinkageWithContract";
	}

}
