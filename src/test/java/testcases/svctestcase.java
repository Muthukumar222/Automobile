package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.loginpage;
import Pages.svc;
import basepackage.baseclass;

public class svctestcase extends baseclass {
	@BeforeTest
	 public void log()  {
			loadwebpage();
		  loginpage p=new loginpage(driver);
		 p.login(prop.getProperty("mobileno"),prop.getProperty("password"));
	  }
 @Test
  public void svcmethod() throws InterruptedException {
	 Thread.sleep(8000);
svc obj=new svc(driver);
obj.svctab.click();
obj.dealername.sendKeys("jobins");
obj.email.sendKeys("divyaa2@yopmail.com");	
obj.vehicle_brand.sendKeys("Honda");
obj.vehicle_type.sendKeys("couple");
obj.service_center.sendKeys("2");
obj.contact_number.sendKeys("9677382431");
obj.address.sendKeys("adyar");
obj.city.sendKeys("chennai");
obj.pincode.sendKeys("643204");
obj.buttonclick.click();
Thread.sleep(8000);
obj.pannumber.sendKeys("963258741236");
obj.tannumber.sendKeys("85236985741");
obj.gstnumber.sendKeys("85564sdsdsd");
obj.setupfees.sendKeys("411");
obj.prepaidamount.sendKeys("5656");
obj.pickupamount.sendKeys("411");
obj.dropamount.sendKeys("522");
obj.pickupanddrop.sendKeys("85");
obj.pickupdrop_distance_fee.sendKeys("55");
obj.pickupdrop_double_distance.sendKeys("41");
Thread.sleep(2000);
obj.pickup_and_drop_double_distance_fee.sendKeys("55");
obj.conveniencefee.sendKeys("85");
obj.chauffeur_doubledistance_fee.sendKeys("55");
obj.chauffeur_doubledistance_kms.sendKeys("452");
obj.slab1.sendKeys("85");
obj.slab2.sendKeys("52");
obj.slab3.sendKeys("89");
obj.slab4.sendKeys("85");
obj.slab1amount.sendKeys("55");
obj.slab2amount.sendKeys("88");
obj.slab3amount.sendKeys("88");
obj.slab4amount.sendKeys("8");
obj.amount_transaction_charge.sendKeys("88");
obj.cancellation_charge.sendKeys("88");
obj.nextbutton.click();
Thread.sleep(1000);
obj.fullname.sendKeys("DIvya krishnan");
obj.mobilenumber.sendKeys("9677382431");
obj.contactemailid.sendKeys("diya@yopmail.com");
obj.dealercode.sendKeys("1001");
obj.submit.click();

  }
}

