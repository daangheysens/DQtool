/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Product extends DataElement {

	/**
	 * @param dataField
	 */
	public Product(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "Product";
	}

}
