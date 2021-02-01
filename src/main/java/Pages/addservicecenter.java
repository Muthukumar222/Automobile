package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addservicecenter {
	
	@FindBy(xpath="//a[contains(text(),'Add Service Centre')]")
	public WebElement tabsvccenter;
	@FindBy(xpath="//*[@name='servicecentre_name']")
	public WebElement servic_centername;
	@FindBy(xpath="//*[@class='ant-select-selection-item']\"))")
	public WebElement dealername1;
	
	//Select dealername1 = new Select (driver.findElement(By.xpath("//*[@class='ant-select-selection-item']")));
			//public dealername1;
			private WebDriver driver;
			public addservicecenter(WebDriver driverm) {
				this.driver=driverm;
				PageFactory.initElements(driver,this);
				
			}
}
