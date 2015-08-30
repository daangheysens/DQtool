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

}
