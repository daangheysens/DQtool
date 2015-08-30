/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class PreclinicalResearchIndicator extends DataElement {

	/**
	 * @param dataField
	 */
	public PreclinicalResearchIndicator(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "PreclinicalResearchIndicator";
	}

}
