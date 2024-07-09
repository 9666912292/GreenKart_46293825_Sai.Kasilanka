package web_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;

public class ScenarioPage_3 extends BasePage {
	
	WebDriver driver;
	
	public ScenarioPage_3(WebDriver driver) {
		this.driver=driver;
	}
	By clickingitem5=By.xpath("(//button[@type='button'])[7]");
	By clickingitem6=By.xpath("(//button[@type='button'])[8]");
	By clickingitem7=By.xpath("(//button[@type='button'])[9]");
	By clickCart=By.xpath("(//img[@alt='Cart'])");
	By ActualText5 =By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[4]/div[1]/p[1]/font/font");
	By ActualText6 =By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[5]/div[1]/p[1]/font/font");
	By ActualText7 =By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[6]/div[1]/p[1]/font/font");
	By ClicksearchFeild=By.xpath("(//input[@placeholder='Search for Vegetables and Fruits'])");
	By SearchProducts=By.xpath("(//input[@type='search'])[1]");
	By ClickSearchButton =By.xpath("//button[@type='submit']");
	By IncreaseProduct1 =By.xpath("(//a[@class='increment'])");
	By ClickAddToCart =By.xpath("(//button[@type='button'])[2]");
	By clickCartPage=By.xpath("(//img[@alt='Cart'])");
	By ActualText1 =By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[7]/div[1]/p[1]/font/font");
	By ActualPrice1 =By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[1]/div[1]/ul/li[7]/div[1]/p[2]/font/font");
	By RemoveProduct3= By.xpath("(//a[@class='product-remove'])[3]");
	
	
	public void Clicking_item5() {
		waits1(driver,Duration.ofSeconds(10),clickingitem5);
		WebElement e1= driver.findElement(clickingitem5);
		clickMethod(e1);
		log.debug("Click Tomato");
	}
	
	public void Clicking_item6() {
		waits1(driver,Duration.ofSeconds(10),clickingitem6);
		WebElement e2= driver.findElement(clickingitem6);
		clickMethod(e2);
		log.debug("Click Beans");
	}
	
	public void Clicking_item7() {
		waits1(driver,Duration.ofSeconds(10),clickingitem7);
		WebElement e3= driver.findElement(clickingitem7);
		clickMethod(e3);
		log.debug("Click Brinjal");
	}
	
	public void Clicking_cart() {
		waits1(driver,Duration.ofSeconds(10),clickCart);
		WebElement e4= driver.findElement(clickCart);
		clickMethod(e4);
	}
	
	public void validation_ActualText5() throws InterruptedException {
		//waits1(driver,Duration.ofSeconds(10),ActualText5);
		try {
			Assert.assertEquals("Tomato - 1 Kg",driver.findElement(ActualText5).getText());  
			System.out.println(driver.findElement(ActualText5).getText());
			Thread.sleep(10000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public void validation_ActualText6() throws InterruptedException {
		//waits1(driver,Duration.ofSeconds(5),ActualText6);
		try {
			Assert.assertEquals("Beans - 1 Kg",driver.findElement(ActualText6).getText());  
			System.out.println(driver.findElement(ActualText6).getText());
			Thread.sleep(10000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public void validation_ActualText7() {
		//waits1(driver,Duration.ofSeconds(5),ActualText7);
		try {
			Assert.assertEquals("Brinjal - 1 Kg",driver.findElement(ActualText7).getText());  
			System.out.println(driver.findElement(ActualText7).getText());
			Thread.sleep(10000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}
	
	public void Click_searchFeild() {
		waits1(driver,Duration.ofSeconds(10),ClicksearchFeild);
		WebElement e5= driver.findElement(ClicksearchFeild);
		clickMethod(e5);
		log.debug("Click Search ");
	}
	
	public void Search_products(String SearchProduct) {
		driver.findElement(SearchProducts).sendKeys(SearchProduct);
		System.out.println(SearchProduct);
	}
	/*public void Search_product()  {
		waits1(driver,Duration.ofSeconds(10),SearchProduct);
		WebElement e6=driver.findElement(SearchProduct);
		sendkeys(e6,"Capsicum");
	}*/
	
	public void Click_SearchButton() {
		waits1(driver,Duration.ofSeconds(10),ClickSearchButton);
		WebElement e7= driver.findElement(ClickSearchButton);
		clickMethod(e7);	
	}
	public void Increase_Product1() {
		waits1(driver,Duration.ofSeconds(10),IncreaseProduct1);
		WebElement e8= driver.findElement(IncreaseProduct1);
		Actions actions = new Actions(driver);
		actions.doubleClick(e8).perform();
		log.debug("Increase Capsicum to quantity 3");
	}
	
	public void Click_AddToCart() {
		waits1(driver,Duration.ofSeconds(10),ClickAddToCart);
		WebElement e9= driver.findElement(ClickAddToCart);
		clickMethod(e9);	
	}
	
	public void click_CartPage() {
		waits1(driver,Duration.ofSeconds(10),clickCartPage);
		WebElement e10= driver.findElement(clickCartPage);
		clickMethod(e10);
		log.debug("Click cart page");
	}
	
	public void validation_ActualText1() {
		//waits1(driver,Duration.ofSeconds(5),ActualText1);
		try {
		Assert.assertEquals("Capsicum",driver.findElement(ActualText1).getText());  
		System.out.println(driver.findElement(ActualText1).getText()); 
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void validation_ActualPrice1() {
		//waits1(driver,Duration.ofSeconds(5),ActualPrice1);
		try {
		Assert.assertEquals("60",driver.findElement(ActualPrice1).getText());  
		System.out.println(driver.findElement(ActualPrice1).getText());
		Thread.sleep(3000);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void Remove_Product3() {
		waits1(driver,Duration.ofSeconds(10),RemoveProduct3);
		WebElement e11= driver.findElement(RemoveProduct3);
		clickMethod(e11);	
	}
}
