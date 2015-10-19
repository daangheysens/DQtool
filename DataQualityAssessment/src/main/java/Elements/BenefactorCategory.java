/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class BenefactorCategory extends DataElement {

	/**
	 * @param dataField
	 */
	public BenefactorCategory(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "BenefactorCategory";	
	}

}
