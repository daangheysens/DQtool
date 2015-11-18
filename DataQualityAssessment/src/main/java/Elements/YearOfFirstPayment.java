/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class YearOfFirstPayment extends DataElement {

	/**
	 * @param dataField
	 */
	public YearOfFirstPayment(Object dataField) 
	{
		super(dataField);
		try 
		{
			double year = Double.parseDouble((String) dataField);
			this.dataField = year;
		}
		catch (Exception ex) {}
		this.mandatory = false;
		this.numeric = true;
		this.date = false;
		this.lov = false;
		this.elementName = "YearOfFirstPayment";
	}

}
