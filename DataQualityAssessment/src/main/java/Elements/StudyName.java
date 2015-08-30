package Elements;

public class StudyName extends DataElement {

	public StudyName(Object dataField) 
	{
		super(dataField);
		this.mandatory = false;
		this.numeric = false;
		this.date = false;
		this.lov = false;
		this.elementName = "StudyName";
	}

}
