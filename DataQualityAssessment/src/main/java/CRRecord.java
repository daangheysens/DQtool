import java.util.LinkedList;


import Elements.*;
import Repository.Affiliate;

/**
 * 
 */

/**
 * @author Daan
 *
 */
public class CRRecord extends DataRecord{
	
	private CRFile file;
	
	public CRId crid;
	public CRCategory crcategory ;
	public FirstName firstname ;
	public MiddleName middlename;
	public LastName lastname ;
	public InstitutionName institutionname ;
	public Degree degree ;
	public Gender gender ;
	public DateOfBirth dateofbirth;
	public Title title ;
	public Specialty specialty_1 ;
	public Specialty specialty_2 ;
	public Specialty specialty_3 ;
	public Specialty specialty_4 ;
	public Specialty specialty_5 ;
	public Counsel counsel ;
	public OrganizationName organizationname ;
	public BusinessArea businessarea ;
	public NovartisContact novartiscontact ;
	public BudgetOwner budgetowner ;
	public Brick brick ;
	public IdNumber idnumber_1 ;
	public IdType idtype_1 ;
	public OfficialIdFlag idofficial_1 ;
	public IdNumber idnumber_2 ;
	public IdType idtype_2 ;
	public OfficialIdFlag idofficial_2 ;
	public IdNumber idnumber_3 ;
	public IdType idtype_3 ;
	public OfficialIdFlag idofficial_3 ;
	public Country country ;
	public Division division ;
	public CRType crtype ;
	public EmailAddress emailaddress ;
	public BenefactorCategory benefactorcategory ;
	public ConsentIndicator consentindicator ;
	public ConsentEffectiveDate consenteffectivedate ;
	public ConsentEndDate consentenddate ;
	public ConsentComment consentcomment ;
	public ConsentReceivedDate consentreceiveddate ;
	public ConsentId consentid ;
	public ReasonForChange reasonforchange;
	public Address address1;
	public Address address2;
	public Address address3;
	public Address address4;
	public Address address5;
	public Address address6;
	public Address address7;
	public Address address8;
	public Address address9;
	public Address address10;

	public CRRecord (LinkedList<Object> fields, CRFile file)
	{
		this.file = file;
		
		this.crid  = new CRId(fields.get(0));
		this.crcategory  = new CRCategory(fields.get(1));
		this.firstname  = new FirstName(fields.get(2));
		this.middlename = new MiddleName(fields.get(3));
		this.lastname  = new LastName(fields.get(4));
		this.institutionname  = new InstitutionName(fields.get(5));
		this.degree  = new Degree(fields.get(6));
		this.gender  = new Gender(fields.get(7));
		this.dateofbirth = new DateOfBirth(fields.get(8));
		this.title  = new Title(fields.get(9));
		this.specialty_1  = new Specialty(fields.get(10));
		this.specialty_2  = new Specialty(fields.get(11));
		this.specialty_3  = new Specialty(fields.get(12));
		this.specialty_4  = new Specialty(fields.get(13));
		this.specialty_5  = new Specialty(fields.get(14));
		this.counsel  = new Counsel(fields.get(15));
		this.organizationname  = new OrganizationName(fields.get(16));
		this.businessarea  = new BusinessArea(fields.get(17));
		this.novartiscontact  = new NovartisContact(fields.get(18));
		this.budgetowner  = new BudgetOwner(fields.get(19));
		this.brick  = new Brick(fields.get(20));
		this.idnumber_1  = new IdNumber(fields.get(21));
		this.idtype_1  = new IdType(fields.get(22));
		this.idofficial_1  = new OfficialIdFlag(fields.get(23));
		this.idnumber_2  = new IdNumber(fields.get(24));
		this.idtype_2  = new IdType(fields.get(25));
		this.idofficial_2  = new OfficialIdFlag(fields.get(26));
		this.idnumber_3  = new IdNumber(fields.get(27));
		this.idtype_3  = new IdType(fields.get(28));
		this.idofficial_3  = new OfficialIdFlag(fields.get(29));
		this.country  = new Country(fields.get(30));
		this.division  = new Division(fields.get(31));
		this.crtype  = new CRType(fields.get(32));
		this.emailaddress  = new EmailAddress(fields.get(33));
		this.benefactorcategory  = new BenefactorCategory(fields.get(34));
		this.consentindicator  = new ConsentIndicator(fields.get(35));
		this.consenteffectivedate  = new ConsentEffectiveDate(fields.get(36));
		this.consentenddate  = new ConsentEndDate(fields.get(37));
		this.consentcomment  = new ConsentComment(fields.get(38));
		this.consentreceiveddate  = new ConsentReceivedDate(fields.get(39));
		this.consentid  = new ConsentId(fields.get(40));
		this.reasonforchange  = new ReasonForChange(fields.get(41));
		this.address1  = new Address( new AddressType(fields.get(42)), new AddressLine(fields.get(43)), new AddressLine(fields.get(46)), new AddressLine(fields.get(45)), new AddressLine(fields.get(46)), new City(fields.get(47)), new ZipCode(fields.get(48)), new StateProvinceRegionCounty(fields.get(49)), new Country(fields.get(50)));
		this.address2  = new Address( new AddressType(fields.get(51)), new AddressLine(fields.get(52)), new AddressLine(fields.get(52)), new AddressLine(fields.get(54)), new AddressLine(fields.get(55)), new City(fields.get(56)), new ZipCode(fields.get(57)), new StateProvinceRegionCounty(fields.get(58)), new Country(fields.get(59)));
		this.address3  = new Address( new AddressType(fields.get(60)), new AddressLine(fields.get(61)), new AddressLine(fields.get(62)), new AddressLine(fields.get(63)), new AddressLine(fields.get(64)), new City(fields.get(65)), new ZipCode(fields.get(66)), new StateProvinceRegionCounty(fields.get(67)), new Country(fields.get(68)));
		this.address4  = new Address( new AddressType(fields.get(69)), new AddressLine(fields.get(71)), new AddressLine(fields.get(71)), new AddressLine(fields.get(72)), new AddressLine(fields.get(73)), new City(fields.get(74)), new ZipCode(fields.get(75)), new StateProvinceRegionCounty(fields.get(76)), new Country(fields.get(77)));
		this.address5  = new Address( new AddressType(fields.get(78)), new AddressLine(fields.get(79)), new AddressLine(fields.get(80)), new AddressLine(fields.get(81)), new AddressLine(fields.get(82)), new City(fields.get(83)), new ZipCode(fields.get(84)), new StateProvinceRegionCounty(fields.get(85)), new Country(fields.get(86)));
		this.address6  = new Address( new AddressType(fields.get(87)), new AddressLine(fields.get(88)), new AddressLine(fields.get(89)), new AddressLine(fields.get(90)), new AddressLine(fields.get(91)), new City(fields.get(92)), new ZipCode(fields.get(93)), new StateProvinceRegionCounty(fields.get(94)), new Country(fields.get(95)));
		this.address7  = new Address( new AddressType(fields.get(96)), new AddressLine(fields.get(97)), new AddressLine(fields.get(98)), new AddressLine(fields.get(99)), new AddressLine(fields.get(100)), new City(fields.get(101)), new ZipCode(fields.get(102)), new StateProvinceRegionCounty(fields.get(103)), new Country(fields.get(104)));
		this.address8  = new Address( new AddressType(fields.get(105)), new AddressLine(fields.get(106)), new AddressLine(fields.get(107)), new AddressLine(fields.get(108)), new AddressLine(fields.get(109)), new City(fields.get(110)), new ZipCode(fields.get(111)), new StateProvinceRegionCounty(fields.get(112)), new Country(fields.get(113)));
		this.address9  = new Address( new AddressType(fields.get(114)), new AddressLine(fields.get(115)), new AddressLine(fields.get(116)), new AddressLine(fields.get(117)), new AddressLine(fields.get(118)), new City(fields.get(119)), new ZipCode(fields.get(120)), new StateProvinceRegionCounty(fields.get(121)), new Country(fields.get(122)));
		this.address10  = new Address( new AddressType(fields.get(123)), new AddressLine(fields.get(124)), new AddressLine(fields.get(125)), new AddressLine(fields.get(126)), new AddressLine(fields.get(127)), new City(fields.get(128)), new ZipCode(fields.get(129)), new StateProvinceRegionCounty(fields.get(130)), new Country(fields.get(131)));
		this.address1.setMandatory(true);
		this.address2.setMandatory(false);
		this.address3.setMandatory(false);
		this.address4.setMandatory(false);
		this.address5.setMandatory(false);
		this.address6.setMandatory(false);
		this.address7.setMandatory(false);
		this.address8.setMandatory(false);
		this.address9.setMandatory(false);
		this.address10.setMandatory(false);
		

		
		
		//set Conditionals according to CR Category
		if (this.crcategory.getData().toString().equals("HCP"))
		{
			this.firstname.setMandatory(true);
			this.lastname.setMandatory(true);
			this.crtype.setMandatory(true);
		}
		else if (this.crcategory.getData().toString().equals("HCO"))
		{
			this.organizationname.setMandatory(true);
			this.crtype.setMandatory(true);
		}
		
		//set Conditionals according to ConsentIndicator
		if (this.consentindicator.getData().toString() == "Y" || 
				this.consentindicator.getData().toString() == "N")
		{
			this.consenteffectivedate.setMandatory(true);
			this.consentenddate.setMandatory(true);
			this.consentid.setMandatory(true);
			this.consentreceiveddate.setMandatory(true);
		}
		
		//set Conditionals for IdNumber and IdType
		this.idnumber_2.setMandatory(false);
		this.idnumber_3.setMandatory(false);
		this.idtype_2.setMandatory(false);
		this.idtype_3.setMandatory(false);
		
		this.elements.add(crid);
		this.elements.add(crcategory);
		this.elements.add(firstname);
		this.elements.add(lastname);
		this.elements.add(institutionname);
		this.elements.add(degree);
		this.elements.add(gender);
		this.elements.add(title);
		this.elements.add(specialty_1);
		this.elements.add(specialty_2);
		this.elements.add(specialty_3);
		this.elements.add(specialty_4);
		this.elements.add(specialty_5);
		this.elements.add(counsel);
		this.elements.add(organizationname);
		this.elements.add(businessarea);
		this.elements.add(novartiscontact);
		this.elements.add(budgetowner);
		this.elements.add(brick);
		this.elements.add(idnumber_1);
		this.elements.add(idtype_1);
		this.elements.add(idofficial_1);
		this.elements.add(idnumber_2);
		this.elements.add(idtype_2);
		this.elements.add(idofficial_2);
		this.elements.add(idnumber_3);
		this.elements.add(idtype_3);
		this.elements.add(idofficial_3);
		this.elements.add(country);
		this.elements.add(division);
		this.elements.add(crtype);
		this.elements.add(emailaddress);
		this.elements.add(benefactorcategory);
		this.elements.add(consentindicator);
		this.elements.add(consenteffectivedate);
		this.elements.add(consentenddate);
		this.elements.add(consentcomment);
		this.elements.add(consentreceiveddate);
		this.elements.add(consentid);
		this.elements.add(reasonforchange);
		
		this.elements.add(address1.addresstype);
		this.elements.add(address1.addressline1);
		this.elements.add(address1.addressline2);
		this.elements.add(address1.addressline3);
		this.elements.add(address1.addressline4);
		this.elements.add(address1.city);
		this.elements.add(address1.zipcode);
		this.elements.add(address1.stateprovinceregioncounty);
		this.elements.add(address1.country);
		this.elements.add(address2.addresstype);
		this.elements.add(address2.addressline1);
		this.elements.add(address2.addressline2);
		this.elements.add(address2.addressline3);
		this.elements.add(address2.addressline4);
		this.elements.add(address2.city);
		this.elements.add(address2.zipcode);
		this.elements.add(address2.stateprovinceregioncounty);
		this.elements.add(address2.country);
		this.elements.add(address3.addresstype);
		this.elements.add(address3.addressline1);
		this.elements.add(address3.addressline2);
		this.elements.add(address3.addressline3);
		this.elements.add(address3.addressline4);
		this.elements.add(address3.city);
		this.elements.add(address3.zipcode);
		this.elements.add(address3.stateprovinceregioncounty);
		this.elements.add(address3.country);
		this.elements.add(address4.addresstype);
		this.elements.add(address4.addressline1);
		this.elements.add(address4.addressline2);
		this.elements.add(address4.addressline3);
		this.elements.add(address4.addressline4);
		this.elements.add(address4.city);
		this.elements.add(address4.zipcode);
		this.elements.add(address4.stateprovinceregioncounty);
		this.elements.add(address4.country);
		this.elements.add(address5.addresstype);
		this.elements.add(address5.addressline1);
		this.elements.add(address5.addressline2);
		this.elements.add(address5.addressline3);
		this.elements.add(address5.addressline4);
		this.elements.add(address5.city);
		this.elements.add(address5.zipcode);
		this.elements.add(address5.stateprovinceregioncounty);
		this.elements.add(address5.country);
		this.elements.add(address6.addresstype);
		this.elements.add(address6.addressline1);
		this.elements.add(address6.addressline2);
		this.elements.add(address6.addressline3);
		this.elements.add(address6.addressline4);
		this.elements.add(address6.city);
		this.elements.add(address6.zipcode);
		this.elements.add(address6.stateprovinceregioncounty);
		this.elements.add(address6.country);
		this.elements.add(address7.addresstype);
		this.elements.add(address7.addressline1);
		this.elements.add(address7.addressline2);
		this.elements.add(address7.addressline3);
		this.elements.add(address7.addressline4);
		this.elements.add(address7.city);
		this.elements.add(address7.zipcode);
		this.elements.add(address7.stateprovinceregioncounty);
		this.elements.add(address7.country);
		this.elements.add(address8.addresstype);
		this.elements.add(address8.addressline1);
		this.elements.add(address8.addressline2);
		this.elements.add(address8.addressline3);
		this.elements.add(address8.addressline4);
		this.elements.add(address8.city);
		this.elements.add(address8.zipcode);
		this.elements.add(address8.stateprovinceregioncounty);
		this.elements.add(address8.country);
		this.elements.add(address9.addresstype);
		this.elements.add(address9.addressline1);
		this.elements.add(address9.addressline2);
		this.elements.add(address9.addressline3);
		this.elements.add(address9.addressline4);
		this.elements.add(address9.city);
		this.elements.add(address9.zipcode);
		this.elements.add(address9.stateprovinceregioncounty);
		this.elements.add(address9.country);
		this.elements.add(address10.addresstype);
		this.elements.add(address10.addressline1);
		this.elements.add(address10.addressline2);
		this.elements.add(address10.addressline3);
		this.elements.add(address10.addressline4);
		this.elements.add(address10.city);
		this.elements.add(address10.zipcode);
		this.elements.add(address10.stateprovinceregioncounty);
		this.elements.add(address10.country);
	}
	
	public void setFile(CRFile newFile)
	{
		this.file = newFile;
	}
	
	public CRFile getFile()
	{
		return file;
	}
	
	public Affiliate getAffiliate()
	{
		return this.file.getAffiliate();
	}
	
	public IdNumber getLocalCRID1()
	{
		return this.idnumber_1;
	}
	
	public IdNumber getLocalCRID2()
	{
		return this.idnumber_2;
	}
	
	public IdNumber getLocalCRID3()
	{
		return this.idnumber_3;
	}
	
	public IdType getLocalCRIDType1()
	{
		return this.idtype_1;
	}
	
	public IdType getLocalCRIDType2()
	{
		return this.idtype_2;
	}
	
	public IdType getLocalCRIDType3()
	{
		return this.idtype_3;
	}
	

}
