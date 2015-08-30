/**
 * 
 */
package Elements;

/**
 * @author Daan
 *
 */
public class Address {

	/**
	 * @param dataField
	 */
	public AddressType addresstype;
	public AddressLine addressline1;
	public AddressLine addressline2;
	public AddressLine addressline3;
	public AddressLine addressline4;
	public City city;
	public ZipCode zipcode;
	public StateProvinceRegionCounty stateprovinceregioncounty;
	public Country country;
	
	
	public Address(AddressType type, AddressLine line1, AddressLine line2, AddressLine line3, 
			AddressLine line4, City cty, ZipCode zip, StateProvinceRegionCounty state, Country cntry) 
	{
		this.addresstype = type;
		this.addressline1 = line1;
		this.addressline2 = line2;
		this.addressline3 = line3;
		this.addressline4 = line4;
		this.city = cty;
		this.zipcode = zip;
		this.stateprovinceregioncounty = state;
		this.country = cntry;
	}
	
	public void setMandatory(boolean man)
	{
		addresstype.setMandatory(man);
		addressline1.setMandatory(man);
		city.setMandatory(man);
		zipcode.setMandatory(man);
		country.setMandatory(man);
	}

}
