package Elements;

public class CRSpecialty extends DataElement {

	public CRSpecialty(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "CRSpecialty";
	}

}