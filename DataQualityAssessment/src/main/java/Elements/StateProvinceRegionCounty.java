/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class StateProvinceRegionCounty extends DataElement {

	/**
	 * @param dataField
	 */
	public StateProvinceRegionCounty(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "StateProvinceRegionCounty";
	}
	
}
