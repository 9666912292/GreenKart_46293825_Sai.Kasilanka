package web_Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ScenarioPage_4 extends BasePage{
WebDriver driver;
	public ScenarioPage_4(WebDriver driver) {
		this.driver=driver;
	}
	
	By RemoveProduct5= By.xpath("(//a[@class='product-remove'])[5]");
	By CheckOut= By.xpath("(//button[@type='button'])[1]");
	By ClickApply= By.xpath("(//button[@class='promoBtn'])[1]");
	By Errormsg= By.xpath("(//span[@style='color: red;'])");
	By EnterPromoCode= By.xpath("//input[@placeholder='Enter promo code']");
	By ClickApplybutton= By.xpath("(//button[@class='promoBtn'])[1]");
	By InvalidCode= By.xpath("(//span[text()='Invalid code ..!'])");
	By placeOrder= By.xpath("(//button[text()='Place Order'])");
	By SelectCountry= By.xpath("(//select[@style='width: 200px;'])");
	By ClickCheckBox= By.xpath("(//input[@type='checkbox'])");
	By ClickProceed= By.xpath("(//button[text()='Proceed'])");
	
	
	public void RemoveProduct4() {
		waits1(driver,Duration.ofSeconds(30),RemoveProduct5);
		WebElement e1= driver.findElement(RemoveProduct5);
		clickMethod(e1);	
	}
	
	public void Check_out() {
		waits1(driver,Duration.ofSeconds(10),CheckOut);
		WebElement e2= driver.findElement(CheckOut);
		clickMethod(e2);
		log.debug("Click CheckOut");
	}
	
	public void Click_Apply() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),ClickApply);
		WebElement e3= driver.findElement(ClickApply);
		clickMethod(e3);
		Thread.sleep(5000);
		
	}
	
	public void Error_msg() throws InterruptedException {
		//waits1(driver,Duration.ofSeconds(10),Errormsg);
		Assert.assertEquals("Empty code ..!",driver.findElement(Errormsg).getText());  
		System.out.println(driver.findElement(Errormsg).getText());
		Thread.sleep(5000);
	}
	
	public void EnterPromoCode() {
		waits1(driver,Duration.ofSeconds(10),EnterPromoCode);
		WebElement e4= driver.findElement(EnterPromoCode);
		clickMethod(e4);
		sendkeys(e4,"GREENKART");
	}
	
	
	public void Click_Applybutton() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),ClickApplybutton);
		WebElement e5= driver.findElement(ClickApplybutton);
		clickMethod(e5);
		Thread.sleep(5000);
	}
	
	public void Invalid_Code() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),InvalidCode);
		Assert.assertEquals("Invalid code ..!",driver.findElement(InvalidCode).getText());  
		System.out.println(driver.findElement(InvalidCode).getText());
		Thread.sleep(5000);
	}
	
	public void place_Order() {
		waits1(driver,Duration.ofSeconds(10),placeOrder);
		WebElement e6= driver.findElement(placeOrder);
		clickMethod(e6);
		log.debug("Click Place order");
	}
	
	public void Select_country() {
		waits1(driver,Duration.ofSeconds(10),SelectCountry);
		WebElement e7=driver.findElement(SelectCountry);
		dropdown(e7,"India");
		log.debug("Select Country");
	}
	
	public void Click_checkBox() {
		waits1(driver,Duration.ofSeconds(10),ClickCheckBox);
		WebElement e8= driver.findElement(ClickCheckBox);
		clickMethod(e8);
		log.debug("Click CheckBox");
	}
	
	public void Click_Proceed() {
		waits1(driver,Duration.ofSeconds(10),ClickProceed);
		WebElement e9= driver.findElement(ClickProceed);
		clickMethod(e9);
		log.debug("Click Proceed");
	}
	
	
}
