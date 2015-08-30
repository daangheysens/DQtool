/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class CostCenter extends DataElement {

	/**
	 * @param dataField
	 */
	public CostCenter(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "CostCenter";
	}
}
