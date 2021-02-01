package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class svc {
	 {
		// TODO Auto-generated constructor stub
	}
	@FindBy (xpath="//a[contains(text(),'SVC')]")
	public WebElement svctab;
	 //@FindBy (xpath="//*[@id=\"collapsibleNavbar\"]/ul/a[3]/li/div/img")
	 //public WebElement svctab;
	@FindBy (xpath="//*[@name='dealer_name']")
	public WebElement dealername;

	@FindBy (xpath="//*[@name='email_id']")
	public WebElement email;
	@FindBy (xpath="//*[@name='vehicle_brand']")
	public WebElement vehicle_brand;
	@FindBy (xpath="//*[@name='vehicle_type']")
	public WebElement vehicle_type;
	@FindBy(xpath="//*[@name='service_centre']")
	public WebElement service_center;
	@FindBy (xpath="//*[@name='contact_number']")
	public WebElement contact_number;
	@FindBy(xpath="//*[@name='address']")
	public WebElement address;
	@FindBy(xpath="//*[@name='city']")
	public WebElement city;
	@FindBy (xpath="//*[@name='pincode']")
	public WebElement pincode;
	@FindBy(xpath="//*[@eventkey='second']")
	public WebElement buttonclick;
	@FindBy(xpath="//*[@name='pan_number']")
	public WebElement pannumber;
	@FindBy (xpath="//*[@name='tan_number']")
	public WebElement tannumber;
	@FindBy (xpath="//*[@name='gst_number']")
	public WebElement gstnumber;
	@FindBy (xpath="//*[@name='setup_fee']")
	public WebElement setupfees;
	@FindBy(xpath="//*[@name='prepaid_amount']")
	public WebElement prepaidamount;
	@FindBy (xpath="//*[@name='pickup_amount']")
	public WebElement pickupamount;
	@FindBy(xpath="//*[@name='drop_amount']")
	public WebElement dropamount ;
	@FindBy(xpath="//*[@name='pickup_drop_amount']")
	public WebElement pickupanddrop;
	
	@FindBy(xpath="//*[@name='pickupdrop_distance_fee']")
	public WebElement pickupdrop_distance_fee;
	@FindBy(xpath="//*[@name='pickupdrop_double_distance']")
	public WebElement pickupdrop_double_distance;
	
	@FindBy(xpath="//*[@name='pickup_and_drop_double_distance_fee']")
	public WebElement pickup_and_drop_double_distance_fee;
	@FindBy (xpath="//*[@name='convenience_fee']")
	public WebElement conveniencefee;
	@FindBy(xpath="//*[@name='chauffeur_doubledistance_fee']")
	public WebElement chauffeur_doubledistance_fee;
	@FindBy (xpath="//*[@name='chauffeur_doubledistance_kms']")
	public WebElement chauffeur_doubledistance_kms;
	@FindBy (xpath="//*[@name='slab1']")
	public WebElement slab1;
	@FindBy (xpath="//*[@name='slab2']")
	public WebElement slab2;
	@FindBy (xpath="//*[@name='slab3']")
	public WebElement  slab3;
	@FindBy(xpath="//*[@name='slab4']")
	public WebElement slab4;
	@FindBy(xpath="//*[@name='slab1_amount']")
	public WebElement slab1amount;
	@FindBy(xpath="//*[@name='slab2_amount']")
	public WebElement slab2amount;
	@FindBy(xpath="//*[@name='slab3_amount']")
	public WebElement slab3amount;
	@FindBy(xpath="//*[@name='slab4_amount']")
	public WebElement slab4amount;
	
	@FindBy (xpath="//*[@name='amount_transaction_charge']")
	public WebElement amount_transaction_charge;
	@FindBy (xpath="//*[@name='cancellation_charge']") 
	public WebElement cancellation_charge;
	@FindBy (xpath="//*[@class='btn btn-dark-blue next-button']")
	public WebElement nextbutton;
	@FindBy(xpath="//*[@name='full_name']")
	public WebElement fullname;
	@FindBy(xpath="//*[@name='mobile_number']")
	public WebElement mobilenumber;
	@FindBy (xpath="//*[@name='contact_emailid']")
	public WebElement contactemailid;
	@FindBy (xpath="//*[@name='dealer_code']")
	public WebElement  dealercode;
	@FindBy (xpath="//*[@class='btn btn-dark-blue next-button undefined']")
 public WebElement submit;
	private WebDriver driver;	
	public svc(WebDriver driverm) {
		this.driver=driverm;
		PageFactory.initElements(driver,this);
		
	}

}
