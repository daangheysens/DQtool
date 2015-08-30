/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ConsentComment extends DataElement {

	/**
	 * @param dataField
	 */
	public ConsentComment(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "ConsentComment";
	}

}
