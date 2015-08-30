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
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "SAPVendorId";
	}

}
