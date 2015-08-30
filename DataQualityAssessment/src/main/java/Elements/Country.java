/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Country extends DataElement{

	/**
	 * 
	 */
	public Country(Object dataField) 
	{
		super(dataField);
		this.mandatory = true;
		this.numeric = false;
		this.date = false;
		this.lov = true;
		this.elementName = "Country";	
	}
	

}
