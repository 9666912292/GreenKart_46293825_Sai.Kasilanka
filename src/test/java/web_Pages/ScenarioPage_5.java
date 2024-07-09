package web_Pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScenarioPage_5 extends BasePage{
WebDriver driver;
	public ScenarioPage_5(WebDriver driver) {
		this.driver=driver;
	}
	
	By ClickFlightBooking=By.xpath("(//a[@class='cart-header-navlink'])[2]");
	By ClickCountry=By.xpath("(//input[@type='text'])[1]");
	By EnterCountry=By.xpath("(//input[@type='text'])[1]");
	By ClickradioBtn=By.xpath("(//input[@type='radio'])[2]");
	By ClickDepartureCity=By.xpath("(//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'])[1]");
	By ClickArrivalCity=By.xpath("(//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'])[1]");
	By ClickDepartDate=By.xpath("(//input[@name='ctl00$mainContent$view_date1'])[1]");
	By SelectDepartMonth=By.xpath("(//span[text()='January'])");
	By SelectDepartDate=By.xpath("(//a[@class='ui-state-default'])[13]");
	By ClickReturnDate=By.xpath("(//input[@id='ctl00_mainContent_view_date2'])[1]");
	By SelectReturnMonth=By.xpath("(//span[text()='January'])");
	By SelectReturnDate=By.xpath("(//a[@class='ui-state-default'])[5]");
	By ClickPassengers=By.xpath("(//div[text()='1 Adult'])[1]");
	By ClickAdult=By.xpath("(//span[text()='+'])[1]");
	By ClickChild=By.xpath("(//span[text()='+'])[2]");
	By ClickInfant=By.xpath("(//span[text()='+'])[3]");
	By ClickDone=By.xpath("(//input[@value='Done'])[1]");
	By ClickCurrency=By.xpath("(//select[@id='ctl00_mainContent_DropDownListCurrency'])[1]");
	By ClickFam_frnds=By.xpath("(//input[@type='checkbox'])[2]");
	By ClickSearch=By.xpath("(//input[@type='submit'])[1]");
	
	
	public void Click_FlightBooking() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),ClickFlightBooking);
		WebElement e1= driver.findElement(ClickFlightBooking);
		clickMethod(e1);
		Thread.sleep(3000);
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		log.debug("Click Flight Booking");
	}
	
	public void Click_Country() {
		waits1(driver,Duration.ofSeconds(10),ClickCountry);
		WebElement e2= driver.findElement(ClickCountry);
		clickMethod(e2);
	}
	
	public void Enter_Country() {
		waits1(driver,Duration.ofSeconds(10),EnterCountry);
		WebElement e3= driver.findElement(EnterCountry);
		sendkeys(e3,"India");
		e3.sendKeys(Keys.ENTER);
		log.debug("Enter Country");
	}

	public void Click_radioBtn() {
		waits1(driver,Duration.ofSeconds(10),ClickradioBtn);
		WebElement e4= driver.findElement(ClickradioBtn);
		clickMethod(e4);
	}

	public void Click_DepartureCity() {
		waits1(driver,Duration.ofSeconds(10),ClickDepartureCity);
		WebElement e5= driver.findElement(ClickDepartureCity);
		clickMethod(e5);
		sendkeys(e5,"Bengaluru (BLR)");
		log.debug("Click Departure city");
	}
	
	public void Click_ArrivalCity() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),ClickArrivalCity);
		WebElement e6= driver.findElement(ClickArrivalCity);
		clickMethod(e6);
		sendkeys(e6,"Chennai (MAA)");
		Thread.sleep(3000);
		log.debug("Click Arrival city");
	}


	public void Click_DepartDate() {
		waits1(driver,Duration.ofSeconds(10),ClickDepartDate);
		String month="January";
		WebElement e7= driver.findElement(ClickDepartDate);
		clickMethod(e7);
		while(true)
		{
			String mon=driver.findElement(SelectDepartMonth).getText();
			if(month.equals(mon)) 
			{
				break;
			}
		}
		log.debug("Click Calender for depart date");
	}
	public void Select_DepartDate()  {
		waits1(driver,Duration.ofSeconds(10),SelectDepartDate);
		String date="7";
		List<WebElement> alldates = driver.findElements(SelectDepartDate);

		for (WebElement d:alldates)
		{ 
		System.out.println(d.getText());
		if(d.getText().equals(date))
			{
				d.click();
				break;
			}
		}
		WebElement e8= driver.findElement(SelectDepartDate);
		clickMethod(e8);
	}

	public void Click_ReturnDate() {
		waits1(driver,Duration.ofSeconds(10),ClickReturnDate);
		String month="January";
		WebElement e9= driver.findElement(ClickReturnDate);
		clickMethod(e9);
		while(true)
		{
			String mon=driver.findElement(SelectReturnMonth).getText();
			if(month.equals(mon))
			{
				break;
			}
		}
		log.debug("Click Calender for return date");
	}

	public void Select_ReturnDate() {
		waits1(driver,Duration.ofSeconds(10),SelectReturnDate);
		String date="19";
		List<WebElement> alldates = driver.findElements(SelectReturnDate);

		for (WebElement d:alldates)
		{ 
		System.out.println(d.getText());
		if(d.getText().equals(date))
			{
				d.click();
				break;
			}
		}
		WebElement e10= driver.findElement(SelectReturnDate);
		clickMethod(e10);
	}
	
	public void Click_Passengers() {
		waits1(driver,Duration.ofSeconds(10),ClickPassengers);
		WebElement e11= driver.findElement(ClickPassengers);
		clickMethod(e11);
		log.debug("Click Passengers");
	}
	
	public void Click_Adult() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),ClickAdult);
		WebElement e12= driver.findElement(ClickAdult);
		Actions actions = new Actions(driver);
		actions.doubleClick(e12).perform();
		Thread.sleep(3000);
	}
	
	public void Click_Child() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),ClickChild);
		try {
		WebElement e13= driver.findElement(ClickChild);
		clickMethod(e13);
		Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Click_Infant() {
		waits1(driver,Duration.ofSeconds(10),ClickInfant);
		WebElement e14= driver.findElement(ClickInfant);
		clickMethod(e14);
	}
	
	public void Click_Done() {
		waits1(driver,Duration.ofSeconds(10),ClickDone);
		WebElement e15= driver.findElement(ClickDone);
		clickMethod(e15);
	}
	
	public void Click_Currency() {
		waits1(driver,Duration.ofSeconds(10),ClickCurrency);
		WebElement e16= driver.findElement(ClickCurrency);
		clickMethod(e16);
		dropdown(e16,"INR");
	}
	
	public void Click_Fam_frnds() {
		waits1(driver,Duration.ofSeconds(10),ClickFam_frnds);
		WebElement e17= driver.findElement(ClickFam_frnds);
		clickMethod(e17);
	}
	
	public void Click_Searchbtn() {
		waits1(driver,Duration.ofSeconds(10),ClickSearch);
		WebElement e18= driver.findElement(ClickSearch);
		clickMethod(e18);
		log.debug("Click search");
	}
	
}

