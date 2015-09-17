import java.util.LinkedList;

import Elements.DataElement;

/**
 * 
 */

/**
 * @author Daan
 *
 */
public abstract class DataRecord {
	
	protected LinkedList<DataElement> elements = new LinkedList<DataElement>(); 
	protected boolean gotLoaded = true;

	/**
	 * 
	 */
	public DataRecord() 
	{
		
	}
	
	public LinkedList<DataElement> getFields()
	{
		return this.elements;
	}
	
	protected void didNotLoad()
	{
		this.gotLoaded = false;
	}
	
	public boolean isLoaded()
	{
		return this.gotLoaded;
	}

}
