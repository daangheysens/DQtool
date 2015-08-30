/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class AccountingDocumentNumber extends DataElement {

	/**
	 * @param dataField
	 */
	public AccountingDocumentNumber(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "AccountingDocumentNumber";
	}

}
