package web_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ScenarioPage_1 extends BasePage{
WebDriver driver;
	
	public ScenarioPage_1(WebDriver driver) {
		this.driver=driver;
	}
	
	By clicking10thitem=By.xpath("(//button[@type='button'])[11]");
	By clickCart=By.xpath("(//img[@alt='Cart'])");
	By ActualText =By.xpath("(//p[@class='product-name'])");
	By ActualPrice =By.xpath("(//p[@class='product-price'])");
	
	public void Clicking_10thitem() {
		waits1(driver,Duration.ofSeconds(10),clicking10thitem);
		WebElement e1= driver.findElement(clicking10thitem);
		clickMethod(e1);
		log.debug("Click 10th Item");
	}

	public void Clicking_cart() {
		waits1(driver,Duration.ofSeconds(10),clickCart);
		WebElement e2= driver.findElement(clickCart);
		clickMethod(e2);
	}
	
	public void validation_ActualText() {
		waits1(driver,Duration.ofSeconds(10),ActualText);
		Assert.assertEquals("Mushroom - 1 Kg",driver.findElement(ActualText).getText());  
		System.out.println(driver.findElement(ActualText).getText());
	}
	public void validation_ActualPrice() {
		waits1(driver,Duration.ofSeconds(10),ActualPrice);
		Assert.assertEquals("75",driver.findElement(ActualPrice).getText());  
		System.out.println(driver.findElement(ActualPrice).getText());
	}
}
