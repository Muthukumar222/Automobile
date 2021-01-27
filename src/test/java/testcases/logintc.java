package testcases;
import basepackage.baseclass;
import Pages.loginpage;
import org.testng.annotations.Test;

public class logintc extends baseclass {
	/*public logintc() throws IOException {
		super();
	}*/
	@Test(priority=2)
  public void log()  {
		loadwebpage();
	  loginpage p=new loginpage(driver);
	 p.login(prop.getProperty("mobileno"),prop.getProperty("password"));
  }
}
