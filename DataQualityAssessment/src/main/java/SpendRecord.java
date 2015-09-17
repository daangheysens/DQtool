import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import Elements.*;
import Repository.Affiliate;

/**
 * 
 */

/**
 * @author Daan
 *
 */
public class SpendRecord extends DataRecord
{

	private SpendFile file;

	private SpendId spendid;
	private Division division;
	private Country country;
	private IdNumber localcrid;
	private IdType localcridtype;
	private SpendPurpose spendpurpose;
	private OtherSpendPurpose otherspendpurpose;
	private RelationPurpose relationpurpose;
	private RelationType relationtype;
	private SpendDate spenddate;
	private SpendAmount spendamount;
	private Currency spendcurrency;
	private ConsentIndicator consentindicator;
	private ConsentReceivedDate consentreceiveddate;
	private ConsentId consentid;
	private Product productname1;
	private EventId eventid;
	private CRMEventId crmeventid;
	private ContractId contractid;
	private SourceLineId sourcelineid;
	private XBorderFlag xborderflag;
	private PayeeName payeename;
	private Division payingdivision;
	private Country payingcountry;
	private FirstName crfirstname;
	private LastName crlastname;
	private AddressLine craddressline1;
	private City crcity;
	private Country crcountry;
	private ZipCode crzipcode;
	private Specialty crspeciality;
	private PONumber spendponumber;
	private PaymentMethod paymentmethod;
	private PaymentForm paymentform;
	private PaymentNote paymentnote;
	private CostCenter paymentcostcenter;
	private WBS paymentwbs;
	private PONumber ponumber;
	private AddressLine payeestreetaddress1;
	private AddressLine payeestreetaddress2;
	private City payeecity;
	private StateProvinceRegionCounty payeestate_province;
	private ZipCode payeezip;
	private Country payeecountry;
	private PayeeTIN payeetin_npi_duns;
	private Product productname2;
	private Product productname3;
	private Product productname4;
	private Product productname5;
	private YearOfFirstPayment yearoffirstpayment1;
	private YearOfFirstPayment yearoffirstpayment2;
	private YearOfFirstPayment yearoffirstpayment3;
	private YearOfFirstPayment yearoffirstpayment4;
	private YearOfFirstPayment yearoffirstpayment5;
	private PICRIndicator picrphysicianindicator;
	private ClinicalTrialsGovIdentifier clinicaltrialsgovidentifier;
	private StudyName studyname;
	private ContextOfResearch contextofresearch;
	private IdNumber pilocalcrid1;
	private IdNumber pilocalcrid2;
	private IdNumber pilocalcrid3;
	private IdNumber pilocalcrid4;
	private IdNumber pilocalcrid5;
	private IdType picridtype1;
	private IdType picridtype2;
	private IdType picridtype3;
	private IdType picridtype4;
	private IdType picridtype5;
	private PreclinicalResearchIndicator preclinicalresearchindicator;
	private ResearchInformationLink researchinformationlink;
	private ReasonForChange reasonforchange;
	private City lodgingcity;
	private Country lodgingcountry;
	private CustomerClaims customerclaims;
	private SubmissionStatus submissionstatus;
	private LinkageWithContract linkagewithcontract;
	private ProductCategory productcategory;
	private FiscalYearOfSpend fiscalyearofspend;
	private SAPVendorId sapvendorid;
	private AccountingDocumentNumber accountingdocumentnumber;


	public SpendRecord(LinkedList<Object> fields, SpendFile file)
	{
		super();
		this.file = file;

		this.spendid = new SpendId(fields.get(0));
		this.division = new Division(fields.get(1));
		this.country = new Country(fields.get(2));
		this.localcrid = new IdNumber(fields.get(3));
		this.localcridtype = new IdType(fields.get(4));
		this.spendpurpose = new SpendPurpose(fields.get(5));
		this.otherspendpurpose = new OtherSpendPurpose(fields.get(6));
		this.relationpurpose = new RelationPurpose(fields.get(7));
		this.relationtype = new RelationType(fields.get(8));
		this.spenddate = new SpendDate(fields.get(9));
		this.spendamount = new SpendAmount(fields.get(10));
		this.spendcurrency = new Currency(fields.get(11));
		this.consentindicator = new ConsentIndicator(fields.get(12));
		this.consentreceiveddate = new ConsentReceivedDate(fields.get(13));
		this.consentid = new ConsentId(fields.get(14));
		this.productname1 = new Product(fields.get(15));
		this.eventid = new EventId(fields.get(16));
		this.crmeventid = new CRMEventId(fields.get(17));
		this.contractid = new ContractId(fields.get(18));
		this.sourcelineid = new SourceLineId(fields.get(19));
		this.xborderflag = new XBorderFlag(fields.get(20));
		this.payeename = new PayeeName(fields.get(21));
		this.payingdivision = new Division(fields.get(22));
		this.payingcountry = new Country(fields.get(23));
		this.crfirstname = new FirstName(fields.get(24));
		this.crlastname = new LastName(fields.get(25));
		this.craddressline1 = new AddressLine(fields.get(26));
		this.crcity = new City(fields.get(27));
		this.crcountry = new Country(fields.get(28));
		this.crzipcode = new ZipCode(fields.get(29));
		this.crspeciality = new Specialty(fields.get(30));
		this.spendponumber = new PONumber(fields.get(31));
		this.paymentmethod = new PaymentMethod(fields.get(32));
		this.paymentform = new PaymentForm(fields.get(33));
		this.paymentnote = new PaymentNote(fields.get(34));
		this.paymentcostcenter = new CostCenter(fields.get(35));
		this.paymentwbs = new WBS(fields.get(36));
		this.ponumber = new PONumber(fields.get(37));
		this.payeestreetaddress1 = new AddressLine(fields.get(38));
		this.payeestreetaddress2 = new AddressLine(fields.get(39));
		this.payeecity = new City(fields.get(40));
		this.payeestate_province = new StateProvinceRegionCounty(fields.get(41));
		this.payeezip = new ZipCode(fields.get(42));
		this.payeecountry = new Country(fields.get(43));
		this.payeetin_npi_duns = new PayeeTIN(fields.get(44));
		this.productname2 = new Product(fields.get(45));
		this.productname3 = new Product(fields.get(46));
		this.productname4 = new Product(fields.get(47));
		this.productname5 = new Product(fields.get(48));
		this.yearoffirstpayment1 = new YearOfFirstPayment(fields.get(49));
		this.yearoffirstpayment2 = new YearOfFirstPayment(fields.get(50));
		this.yearoffirstpayment3 = new YearOfFirstPayment(fields.get(51));
		this.yearoffirstpayment4 = new YearOfFirstPayment(fields.get(52));
		this.yearoffirstpayment5 = new YearOfFirstPayment(fields.get(53));
		this.picrphysicianindicator = new PICRIndicator(fields.get(54));
		this.clinicaltrialsgovidentifier = new ClinicalTrialsGovIdentifier(fields.get(55));
		this.studyname = new StudyName(fields.get(56));
		this.contextofresearch = new ContextOfResearch(fields.get(57));
		this.pilocalcrid1 = new IdNumber(fields.get(58));
		this.pilocalcrid2 = new IdNumber(fields.get(59));
		this.pilocalcrid3 = new IdNumber(fields.get(60));
		this.pilocalcrid4 = new IdNumber(fields.get(61));
		this.pilocalcrid5 = new IdNumber(fields.get(62));
		this.picridtype1 = new IdType(fields.get(63));
		this.picridtype2 = new IdType(fields.get(64));
		this.picridtype3 = new IdType(fields.get(65));
		this.picridtype4 = new IdType(fields.get(66));
		this.picridtype5 = new IdType(fields.get(67));
		this.preclinicalresearchindicator = new PreclinicalResearchIndicator(fields.get(68));
		this.researchinformationlink = new ResearchInformationLink(fields.get(69));
		this.reasonforchange = new ReasonForChange(fields.get(70));
		this.lodgingcity = new City(fields.get(71));
		this.lodgingcountry = new Country(fields.get(72));
		this.customerclaims = new CustomerClaims(fields.get(73));
		this.submissionstatus = new SubmissionStatus(fields.get(74));
		this.linkagewithcontract = new LinkageWithContract(fields.get(75));
		this.productcategory = new ProductCategory(fields.get(76));
		this.fiscalyearofspend = new FiscalYearOfSpend(fields.get(77));
		this.sapvendorid = new SAPVendorId(fields.get(78));
		this.accountingdocumentnumber = new AccountingDocumentNumber(fields.get(79));

		//set conditionals for x-border spends
		if ((String) this.xborderflag.getData() == "Y")
		{
			this.payingcountry.setMandatory(true);
			this.payingdivision.setMandatory(true);
			this.crfirstname.setMandatory(true);
			this.crlastname.setMandatory(true);
			this.craddressline1.setMandatory(true);
			this.crcity.setMandatory(true);
			this.crcountry.setMandatory(true);
			this.crzipcode.setMandatory(true);
			this.crspeciality.setMandatory(true);
		}
		
		//set conditionals for Consent
		if (this.consentindicator.getData().toString() == "Y" || 
				this.consentindicator.getData().toString() == "N")
		{
			this.consentid.setMandatory(true);
			this.consentreceiveddate.setMandatory(true);
		}

		this.elements.add(spendid);
		this.elements.add(division);
		this.elements.add(country);
		this.elements.add(localcrid);
		this.elements.add(localcridtype);
		this.elements.add(spendpurpose);
		this.elements.add(otherspendpurpose);
		this.elements.add(relationpurpose);
		this.elements.add(relationtype);
		this.elements.add(spenddate);
		this.elements.add(spendamount);
		this.elements.add(spendcurrency);
		this.elements.add(consentindicator);
		this.elements.add(consentreceiveddate);
		this.elements.add(consentid);
		this.elements.add(productname1);
		this.elements.add(eventid);
		this.elements.add(crmeventid);
		this.elements.add(contractid);
		this.elements.add(sourcelineid);
		this.elements.add(xborderflag);
		this.elements.add(payeename);
		this.elements.add(payingdivision);
		this.elements.add(payingcountry);
		this.elements.add(crfirstname);
		this.elements.add(crlastname);
		this.elements.add(craddressline1);
		this.elements.add(crcity);
		this.elements.add(crcountry);
		this.elements.add(crzipcode);
		this.elements.add(crspeciality);
		this.elements.add(spendponumber);
		this.elements.add(paymentmethod);
		this.elements.add(paymentform);
		this.elements.add(paymentnote);
		this.elements.add(paymentcostcenter);
		this.elements.add(paymentwbs);
		this.elements.add(ponumber);
		this.elements.add(payeestreetaddress1);
		this.elements.add(payeestreetaddress2);
		this.elements.add(payeecity);
		this.elements.add(payeestate_province);
		this.elements.add(payeezip);
		this.elements.add(payeecountry);
		this.elements.add(payeetin_npi_duns);
		this.elements.add(productname2);
		this.elements.add(productname3);
		this.elements.add(productname4);
		this.elements.add(productname5);
		this.elements.add(yearoffirstpayment1);
		this.elements.add(yearoffirstpayment2);
		this.elements.add(yearoffirstpayment3);
		this.elements.add(yearoffirstpayment4);
		this.elements.add(yearoffirstpayment5);
		this.elements.add(picrphysicianindicator);
		this.elements.add(clinicaltrialsgovidentifier);
		this.elements.add(studyname);
		this.elements.add(contextofresearch);
		this.elements.add(pilocalcrid1);
		this.elements.add(pilocalcrid2);
		this.elements.add(pilocalcrid3);
		this.elements.add(pilocalcrid4);
		this.elements.add(pilocalcrid5);
		this.elements.add(picridtype1);
		this.elements.add(picridtype2);
		this.elements.add(picridtype3);
		this.elements.add(picridtype4);
		this.elements.add(picridtype5);
		this.elements.add(preclinicalresearchindicator);
		this.elements.add(researchinformationlink);
		this.elements.add(reasonforchange);
		this.elements.add(lodgingcity);
		this.elements.add(lodgingcountry);
		this.elements.add(customerclaims);
		this.elements.add(submissionstatus);
		this.elements.add(linkagewithcontract);
		this.elements.add(productcategory);
		this.elements.add(fiscalyearofspend);
		this.elements.add(sapvendorid);
		this.elements.add(accountingdocumentnumber);
	}

	public void setFile(SpendFile newFile)
	{
		this.file = newFile;
	}

	public SpendFile getFile()
	{
		return file;
	}

	public Affiliate getAffiliate()
	{
		return this.file.getAffiliate();
	}
	
	public IdNumber getLocalCRID()
	{
		return this.localcrid;
	}
	
	public IdType getLocalCRIDType()
	{
		return this.localcridtype;
	}



}
