/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ProductCategory extends DataElement {

	/**
	 * @param dataField
	 */
	public ProductCategory(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "ProductCategory";
	}

}
