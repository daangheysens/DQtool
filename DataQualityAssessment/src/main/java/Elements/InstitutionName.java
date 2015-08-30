/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class InstitutionName extends DataElement{

	/**
	 * 
	 */
	public InstitutionName(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "InstitutionName";
	}

}
