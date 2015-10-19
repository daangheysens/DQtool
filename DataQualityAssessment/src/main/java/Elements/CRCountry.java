package Elements;

public class CRCountry extends DataElement 
{

	public CRCountry(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "CRCountry";
	}

}


