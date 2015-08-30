/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class CRCategory extends DataElement{

	/**
	 * 
	 */
	public CRCategory(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "CRCategory";
	}

}
