/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class SourceLineId extends DataElement {

	/**
	 * @param dataField
	 */
	public SourceLineId(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "SourceLineId";
	}
	

}
