package Repository;
/**
 * 
 */

/**
 * @author Daan
 *
 */
public class Affiliate {

	private String division;
	private String country;
	private int project;

	public Affiliate(String country, String division, int project)
	{
		this.country = country;
		this.division = division;
		this.project = project;
	}
	
	public Affiliate(String country, String division)
	{
		this.country = country;
		this.division = division;
	}

	public String getAffiliateName()
	{
		StringBuilder affiliate = new StringBuilder();
		affiliate.append(country);
		affiliate.append(division);
		return affiliate.toString();
	}

	public String getDivision()
	{
		return this.division;
	}

	public String getCountry()
	{
		return this.country;
	}

	public int getProject()
	{
		return this.project;
	}

}
