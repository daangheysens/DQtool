/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class City extends DataElement {

	/**
	 * @param dataField
	 */
	public City(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "City";
	}


}
