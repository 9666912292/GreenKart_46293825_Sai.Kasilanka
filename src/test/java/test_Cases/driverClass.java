package test_Cases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import utilities.ExcelReader;

public class driverClass {

public static WebDriver driver;
public static Logger log =Logger.getLogger("devpinoyLogger");
public static ExcelReader excel= new ExcelReader("C:\\Users\\SKASILAN\\eclipse\\java-2022-09\\eclipse\\GreenKart_46293825_Sai.Kasilanka\\src\\test\\resources\\Excel\\GreenKart_1.xlsx");
	@BeforeSuite
	public void openbrowser() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\SKASILAN\\Downloads\\chromedriver-win64 (1)");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		log.debug("Url is open");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@AfterSuite
	public void closeBrowser() {
		if(driver!=null) {
			driver.quit();
			log.debug("driver is closed");
			
		}
	}
}


