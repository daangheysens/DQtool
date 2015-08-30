/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class CRId extends DataElement{

	/**
	 * 
	 */
	public CRId(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "CRId";
		//System.out.println(this.dataField.toString());
	}

}
