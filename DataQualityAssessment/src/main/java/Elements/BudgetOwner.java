/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class BudgetOwner extends DataElement {

	/**
	 * @param dataField
	 */
	public BudgetOwner(Object dataField)
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "BudgetOwner";
	}

}
