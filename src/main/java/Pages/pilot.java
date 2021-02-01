package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pilot {

	
	@FindBy(xpath="//*[@id=\"collapsibleNavbar\"]/ul/a[2]/li/div/a")
	public WebElement pilot;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/a/div/div")
	public WebElement addpilot;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/div[1]/input")
    public WebElement firstname;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/div[2]/input")
	public WebElement lastname;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[1]/input")
	public WebElement mobileno;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/input")
	public WebElement alternate;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[3]/div[1]/input")
	public WebElement email;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[3]/div[2]/input")
	public WebElement age;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[4]/textarea")
	public WebElement address;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[5]/div[1]/input")
	public WebElement town;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[5]/div[2]/input")
	public WebElement pincode;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[6]/div[1]/input")
	public WebElement pan;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[6]/div[2]/input")
	public WebElement shift;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[7]/div[1]/input")
 	public WebElement month;
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[7]/div[2]/input")
	public WebElement exp;
	//@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/div/div[2]/div[8]/div/span[1]/div[1]/span")
	//public WebElement upload;
	//WebElement upload =driver.findElement(By.xpath("//*[@class='ant-upload ant-upload-btn']"))) 
@FindBy(xpath="//*[@class='ant-upload ant-upload-btn']")

public WebElement upload;
	@FindBy(xpath ="//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div/div/button")
	public WebElement next;
	public WebDriver driver;
	public pilot(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
