/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Degree extends DataElement{

	/**
	 * 
	 */
	public Degree(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "Degree";
	}

}
