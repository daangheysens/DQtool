import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import Repository.Repository;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Elements.DataElement;

/**
 * 
 */

/**
 * @author Daan
 *
 */
public class ErrorReport {

	private LinkedList<ErrorRecord> errors = new LinkedList<ErrorRecord>();
	private LocalDataFile file;

	public ErrorReport(LocalDataFile f)
	{
		this.file = f;
		this.runReport(file);
	}


	public void runReport(LocalDataFile ldf)
	{

		LinkedList<DataRecord> records = ldf.getRecords();
		for (DataRecord r : records)
		{
			LinkedList<DataElement> fields = r.getFields();
			for (DataElement d : fields)
			{
				if (d.getMandatory())
					{
					//reevaluate isEmpty() 	
					if (d.getData() == null || d.getData().toString().isEmpty()) 
					 	{
					 		ErrorRecord error = new ErrorRecord(403, ldf.getAffiliate(),
									d.getName(), d.getData().toString());
							errors.add(error);
					 	}
					}
				if (d.getLov())
				{
					String lov = d.getData().toString().trim();
					if (Run.getRepository().isGlobalLov(d.getClass().getSimpleName().toLowerCase()))
					{
						if (!Run.getRepository().isValidGlobalLov(d.getClass().getSimpleName(), lov))
						{
							ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
									d.getName(), d.getData().toString());
							errors.add(error);
						}
					}
					else if (Run.getRepository().isLocalLov((file.getAffiliate().getAffiliateName() + 
							d.getClass().getSimpleName().toLowerCase()).toLowerCase()))
					{
						if (!Run.getRepository().isValidLocalLov(ldf.getAffiliate(), d.
								getClass().getSimpleName().toLowerCase(), lov))
						{
							ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
									d.getName(), d.getData().toString());
							errors.add(error);
						}
					}
					else 
					{
						//is not defined for this affiliate
					}
				}
				else if (d.getDate())
				{
					String value = d.getData().toString();
					Date date = null;
					try 
					{
						SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
						date = sdf.parse(value);
						if (!value.equals(sdf.format(date))) 
						{
							date = null;
						}
					} 
					catch (ParseException ex) {}
					if (date == null) 
					{
						ErrorRecord error = new ErrorRecord(402, ldf.getAffiliate(),
								d.getName(), d.getData().toString());
						errors.add(error);
					}
				}
				else if (d.getNumeric())
				{
					if (!(d.getData() instanceof Double || d.getData() instanceof Integer))
					{
						ErrorRecord error = new ErrorRecord(402, ldf.getAffiliate(),
								d.getName(), d.getData().toString());
						errors.add(error);
					}
				}
			}
		}
	}

	public LinkedList<ErrorRecord> getErrors()
	{
		return this.errors;
	}

}
