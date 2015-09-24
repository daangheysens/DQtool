import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Date;
import Elements.CRId;
import Elements.Country;
import Elements.DataElement;
import Elements.Division;
import Elements.SpendId;

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
	private int rejectedRecords = 0;

	public ErrorReport(LocalDataFile f)
	{
		this.file = f;
		this.checkIsolatedErrors(file);
	}


	public void checkIsolatedErrors(LocalDataFile ldf)
	{

		LinkedList<DataRecord> records = ldf.getRecords();
		for (DataRecord r : records)
		{
			

			LinkedList<DataElement> fields = r.getFields();
			for (DataElement d : fields)
			{
				boolean rejected = false;
				
				if (d.getIsNull())
				{
					if (d.getMandatory())
					{
						ErrorRecord error = new ErrorRecord(403, ldf.getAffiliate(),
								d.getName(), d.getData().toString());
						errors.add(error);
						r.didNotLoad();
						rejected = true;
					}
				}
				else
				{
					if (d.getLov())
					{
						if (d instanceof Country)
						{
							if (!d.getData().toString().equals(ldf.getAffiliate().getCountry().toString()))
							{
								ErrorRecord error = new ErrorRecord(406, ldf.getAffiliate(),
										d.getName(), d.getData().toString());
								errors.add(error);
								rejected = true;
							}
						}
						else if (d instanceof Division)
						{
							if (!d.getData().toString().equals(ldf.getAffiliate().getDivision().toString()))
							{
								ErrorRecord error = new ErrorRecord(407, ldf.getAffiliate(),
										d.getName(), d.getData().toString());
								errors.add(error);
								rejected = true;
							}
						}
						else
						{
							String lov = d.getData().toString().trim();
							if (Run.getRepository().isGlobalLov(d.getClass().getSimpleName().toLowerCase()))
							{
								if (!Run.getRepository().isValidGlobalLov(d.getClass().getSimpleName(), lov))
								{
									ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
											d.getName(), d.getData().toString());
									errors.add(error);
									rejected = true;
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
									rejected = true;
								}
							}
							else 
							{
								//is not defined for this affiliate
							}
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
							rejected = true;
						}
					}
					else if (d.getNumeric())
					{
						if (!(d.getData() instanceof Double || d.getData() instanceof Integer))
						{
							ErrorRecord error = new ErrorRecord(402, ldf.getAffiliate(),
									d.getName(), d.getData().toString());
							errors.add(error);
							rejected = true;
						}
					}
					else if (d instanceof CRId || d instanceof SpendId)
					{
						if (!d.getIsNull())
						{
							//TODO adjust error
							ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
									d.getName(), d.getData().toString());
							errors.add(error);
							rejected = true;
						}
					}
				}
				if (rejected)
				{
					this.rejectedRecords++;
					r.didNotLoad();
				}
			}

		}
	}

	public LinkedList<ErrorRecord> getErrors()
	{
		return this.errors;
	}

	public int getRejectedRecords()
	{
		return this.rejectedRecords;
	}

}
