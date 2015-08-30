/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ClinicalTrialsGovIdentifier extends DataElement {

	/**
	 * @param dataField
	 */
	public ClinicalTrialsGovIdentifier(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "ClinicalTrialsGovIdentifier";
	}
}
