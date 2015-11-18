/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class SAPVendorId extends DataElement {

	/**
	 * @param dataField
	 */
	public SAPVendorId(Object dataField) 
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
		this.elementName = "SAPVendorId";
	}

}
