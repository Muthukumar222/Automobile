package testcases;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.addservicecenter;
import Pages.loginpage;
import basepackage.baseclass;

public class addservicecenterTC extends baseclass {
	@BeforeTest
	  public void login() throws InterruptedException {
		   loadwebpage();
		  loginpage p=new loginpage(driver);
			 p.login(prop.getProperty("mobileno"),prop.getProperty("password"));
	}


  @Test
  public void servicecenteradd() {
	  addservicecenter obj1=new addservicecenter(driver);
	  obj1.tabsvccenter.click();
	  obj1.servic_centername.sendKeys("DIvyadealer");
	  Select dropdown=Select(dealername1);
	  dropdown.selectByIndex(1);
  }
}
