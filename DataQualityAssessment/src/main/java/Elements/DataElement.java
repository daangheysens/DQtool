package Elements;

public abstract class DataElement {
	
	
	protected String elementName;
	protected boolean mandatory;
	protected boolean numeric;
	protected boolean date;
	protected boolean lov;
	protected boolean isNull = false;
	protected Object dataField;
	
	public DataElement(Object dataField)
	{
		this.dataField = dataField;
		if (dataField.toString().isEmpty())
		{
			isNull = true;
		}
	}
	
	public String getName()
	{
		return this.elementName;
	}
	
	public boolean getMandatory()
	{
		return this.mandatory;
	}
	
	public boolean getNumeric()
	{
		return this.numeric;
	}
	
	public boolean getDate()
	{
		return this.date;
	}
	
	public boolean getLov()
	{
		return this.lov;
	}
	
	public Object getData()
	{
		return this.dataField;
	}
	
	public void setMandatory(boolean man)
	{
		this.mandatory = man;
	}
	
	public void setName(String name)
	{
		this.elementName = name;
	}
	
	public boolean getIsNull()
	{
		return this.isNull;
	}
	

}
