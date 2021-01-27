package basepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {
	public Properties prop;
	public WebDriver driver;
	public void loadwebpage() {
		System.setProperty("webdriver.chrome.driver","E:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		prop=new Properties();
		FileInputStream file;
			try {
				//file = new FileInputStream("C:\\Eclipse\\Project\\Automobile\\src\\main\\java\\properties\\input.properties");
				file = new FileInputStream("C:\\Users\\Divya krishnan\\eclipse-workspace\\Automobile\\src\\main\\java\\properties\\input.properties");
				prop.load(file);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}

}
