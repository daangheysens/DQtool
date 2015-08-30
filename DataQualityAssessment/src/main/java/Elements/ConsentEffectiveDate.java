/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class ConsentEffectiveDate extends DataElement {

	/**
	 * @param dataField
	 */
	public ConsentEffectiveDate(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = true;
		this.lov = false;
		this.elementName = "ConsentEffectiveDate";
	}

}
