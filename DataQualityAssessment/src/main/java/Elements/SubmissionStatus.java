/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class SubmissionStatus extends DataElement {

	/**
	 * @param dataField
	 */
	public SubmissionStatus(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "SubmissionStatus";
	}

}
