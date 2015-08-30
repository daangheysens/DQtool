/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ContractId extends DataElement {

	/**
	 * @param dataField
	 */
	public ContractId(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "ContractId";
	}
}
