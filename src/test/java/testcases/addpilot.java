package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.loginpage;
import Pages.pilot;
import basepackage.baseclass;

public class addpilot extends baseclass {
  
@BeforeTest
  public void login() throws InterruptedException {
	   loadwebpage();
	  loginpage p=new loginpage(driver);
		 p.login(prop.getProperty("mobileno"),prop.getProperty("password"));
		 
		 }
@Test(priority=1)
public void newsvc() throws InterruptedException
{
	     Thread.sleep(8000);
		 pilot sv=new pilot(driver);
		 sv.pilot.click();
		 sv.addpilot.click();
		 sv.firstname.sendKeys("Anish");
		 sv.lastname.sendKeys("kumar");
		 sv.mobileno.sendKeys("2323232323");
		 sv.alternate.sendKeys("1234567890");
		 sv.email.sendKeys("tharun@gmail.com");
		 sv.age.sendKeys("35");
		 sv.address.sendKeys("1/8 south street");
		 sv.town.sendKeys("Chennai");
		 sv.pincode.sendKeys("623608");
		 sv.pan.sendKeys("CBLP234");
		 sv.shift.sendKeys("morning");
		 sv.month.sendKeys("15");
		 sv.exp.sendKeys("5");
		sv.upload.click();
		 sv.upload.sendKeys("D:\\image.jpg");
		 Thread.sleep(10000);
		 sv.next.click();
		 //sendKeys("D:\\image.jpg");
  }
}
