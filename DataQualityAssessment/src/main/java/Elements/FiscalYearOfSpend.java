/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class FiscalYearOfSpend extends DataElement {

	/**
	 * @param dataField
	 */
	public FiscalYearOfSpend(Object dataField) {
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "FiscalYearOfSpend";
	}

}
