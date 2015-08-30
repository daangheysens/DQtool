/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PICRIndicator extends DataElement {

	/**
	 * @param dataField
	 */
	public PICRIndicator(Object dataField) {
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "PICRIndicator";
	}

}
