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
		try 
		{
			double id = Double.parseDouble((String) dataField);
			this.dataField = id;
		}
		catch (Exception ex) {}
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "ContractId";
	}
}
