/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ResearchInformationLink extends DataElement {

	/**
	 * @param dataField
	 */
	public ResearchInformationLink(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "ResearchInformationLink";
	}

}
