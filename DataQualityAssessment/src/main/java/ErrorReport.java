import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Date;
import java.util.HashMap;

import Elements.CRId;
import Elements.Country;
import Elements.DataElement;
import Elements.Division;
import Elements.SpendAmount;
import Elements.SpendId;

/**
 * 
 */

/**
 * @author Daan
 *
 */
public class ErrorReport {

	private HashMap<String, ErrorRecordCount> errors = new HashMap<String, ErrorRecordCount>();
	private LocalDataFile file;

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
			boolean rejected = false;
			
			for (DataElement d : fields)
			{				
				if (d.getIsNull())
				{
					if (d.getMandatory())
					{
						String errKey = "403" + ldf.getAffiliate().getAffiliateName() + 
								d.getName() + d.getData().toString();
						if (errors.containsKey(errKey))
						{
							errors.get(errKey).increaseErrorCount();
						}
						else
						{
							ErrorRecord error = new ErrorRecord(403, ldf.getAffiliate(),
									d.getName(), d.getData().toString());
							errors.put(errKey, new ErrorRecordCount(error, errKey));
						}			
						rejected = true;
					}
				}
				else
				{
					if (d.getLov())
					{
						if (d instanceof Country && d.getName().equals("Country"))
						{
							if (!d.getData().toString().equals(ldf.getAffiliate().getCountry().toString()))
							{
								String errKey = "406" + ldf.getAffiliate().getAffiliateName() + 
										d.getName() + d.getData().toString();
								if (errors.containsKey(errKey))
								{
									errors.get(errKey).increaseErrorCount();
								}
								else
								{
									ErrorRecord error = new ErrorRecord(406, ldf.getAffiliate(),
											d.getName(), d.getData().toString());
									errors.put(errKey, new ErrorRecordCount(error, errKey));
								}			
								rejected = true;
							}
						}
						else if (d instanceof Division && d.getName().equals("Division"))
						{
							if (!d.getData().toString().equals(ldf.getAffiliate().getDivision().toString()))
							{
								String errKey = "407" + ldf.getAffiliate().getAffiliateName() + 
										d.getName() + d.getData().toString();
								if (errors.containsKey(errKey))
								{
									errors.get(errKey).increaseErrorCount();
								}
								else
								{
									ErrorRecord error = new ErrorRecord(407, ldf.getAffiliate(),
											d.getName(), d.getData().toString());
									errors.put(errKey, new ErrorRecordCount(error, errKey));
								}			
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
									String errKey = "401" + ldf.getAffiliate().getAffiliateName() + 
											d.getName() + d.getData().toString();
									if (errors.containsKey(errKey))
									{
										errors.get(errKey).increaseErrorCount();
									}
									else
									{
										ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
												d.getName(), d.getData().toString());
										errors.put(errKey, new ErrorRecordCount(error, errKey));
									}			
									rejected = true;
								}
							}
							else if (Run.getRepository().isLocalLov((file.getAffiliate().getAffiliateName() + 
									d.getClass().getSimpleName().toLowerCase()).toLowerCase()))
							{
								if (!Run.getRepository().isValidLocalLov(ldf.getAffiliate(), d.
										getClass().getSimpleName().toLowerCase(), lov))
								{
									String errKey = "401" + ldf.getAffiliate().getAffiliateName() + 
											d.getName() + d.getData().toString();
									if (errors.containsKey(errKey))
									{
										errors.get(errKey).increaseErrorCount();
									}
									else
									{
										ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
												d.getName(), d.getData().toString());
										errors.put(errKey, new ErrorRecordCount(error, errKey));
									}			
									rejected = true;
								}
							}
							else //Local LoV not defined for affiliate
							{
								String errKey = "401" + ldf.getAffiliate().getAffiliateName() + 
										d.getName() + d.getData().toString(); //d.getData().toString();
								if (errors.containsKey(errKey))
								{
									errors.get(errKey).increaseErrorCount();
								}
								else
								{
									ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
											d.getName(), d.getData().toString()); //d.getData().toString());
									errors.put(errKey, new ErrorRecordCount(error, errKey));
								}			
								rejected = true;
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
							String errKey = "402" + ldf.getAffiliate().getAffiliateName() + 
									d.getName() + d.getData().toString();
							if (errors.containsKey(errKey))
							{
								errors.get(errKey).increaseErrorCount();
							}
							else
							{
								ErrorRecord error = new ErrorRecord(402, ldf.getAffiliate(),
										d.getName(), d.getData().toString());
								errors.put(errKey, new ErrorRecordCount(error, errKey));
							}			
							rejected = true;
						}
					}
					else if (d.getNumeric())
					{
						boolean formatSpendAmount = false;
						if(!(d instanceof SpendAmount) || formatSpendAmount)
						{
							//old: !(d.getData().toString().matches("[][0-9]+([,.][0-9]{1,2})?"))
							if (!( d.getData() instanceof Double ))
							{
								String errKey = "402" + ldf.getAffiliate().getAffiliateName() + 
										d.getName() + d.getData().toString();
								if (errors.containsKey(errKey))
								{
									errors.get(errKey).increaseErrorCount();
								}
								else
								{
									ErrorRecord error = new ErrorRecord(402, ldf.getAffiliate(),
											d.getName(), d.getData().toString());
									errors.put(errKey, new ErrorRecordCount(error, errKey));
								}			
								rejected = true;
							}
						}
					}
					else if (d instanceof CRId || d instanceof SpendId)
					{
						if (!d.getIsNull())
						{
							//TODO adjust error
							String errKey = "401" + ldf.getAffiliate().getAffiliateName() + 
									d.getName() + d.getData().toString();
							if (errors.containsKey(errKey))
							{
								errors.get(errKey).increaseErrorCount();
							}
							else
							{
								ErrorRecord error = new ErrorRecord(401, ldf.getAffiliate(),
										d.getName(), d.getData().toString());
								errors.put(errKey, new ErrorRecordCount(error, errKey));
							}			
							rejected = true;
						}
					}
				}
				
			}
			if (rejected)
			{
				r.didNotLoad();
			}
		}
	}

	public HashMap<String, ErrorRecordCount> getErrors()
	{
		return this.errors;
	}



}
