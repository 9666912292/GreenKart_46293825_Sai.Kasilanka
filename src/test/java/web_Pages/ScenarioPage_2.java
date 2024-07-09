package web_Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ScenarioPage_2 extends BasePage {
WebDriver driver;
	
	public ScenarioPage_2(WebDriver driver) {
		this.driver=driver;
	}
	
	By clickCart1=By.xpath("(//img[@alt='Cart'])");
	By clickingitem2=By.xpath("(//button[@type='button'])[2]");
	By clickingitem3=By.xpath("(//button[@type='button'])[6]");
	By clickingitem4=By.xpath("(//button[@type='button'])[5]");
	By clickCart=By.xpath("(//img[@alt='Cart'])");
	By ActualText2 =By.xpath("(//p[@class='product-name'])[2]");
	By ActualText3 =By.xpath("(//p[@class='product-name'])[3]");
	By ActualText4 =By.xpath("(//P[@class='product-name'])[4]");
	By RemoveProduct= By.xpath("(//a[@class='product-remove'])[3]");
	
	
	public void Clicking_cart1() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),clickCart1);
		WebElement e1= driver.findElement(clickCart1);
		clickMethod(e1);
		Thread.sleep(3000);
	}
	
	public void Clicking_item2() throws InterruptedException {
		waits1(driver,Duration.ofSeconds(10),clickingitem2);
		WebElement e2= driver.findElement(clickingitem2);
		Actions actions = new Actions(driver);
		actions.doubleClick(e2).perform();
		Thread.sleep(3000);
		log.debug("Click Brocolli");
	}

	public void Clicking_item3() {
		waits1(driver,Duration.ofSeconds(10),clickingitem3);
		WebElement e3= driver.findElement(clickingitem3);
		clickMethod(e3);
		log.debug("Click Carrot");
	}
	
	public void Clicking_item4() {
		waits1(driver,Duration.ofSeconds(10),clickingitem4);
		WebElement e4= driver.findElement(clickingitem4);
		clickMethod(e4);
		log.debug("Click Beetroot");
	}

	public void Clicking_cart() {
		waits1(driver,Duration.ofSeconds(10),clickCart);
		WebElement e5= driver.findElement(clickCart);
		clickMethod(e5);
	}
	
	public void validation_ActualText2() {
		waits1(driver,Duration.ofSeconds(10),ActualText2);
		Assert.assertEquals("Brocolli - 1 Kg",driver.findElement(ActualText2).getText());  
		System.out.println(driver.findElement(ActualText2).getText());
	}
	
	public void validation_ActualText3() {
		waits1(driver,Duration.ofSeconds(10),ActualText3);
		Assert.assertEquals("Carrot - 1 Kg",driver.findElement(ActualText3).getText());  
		System.out.println(driver.findElement(ActualText2).getText());	
	}
	
	public void validation_ActualText4() {
		waits1(driver,Duration.ofSeconds(10),ActualText4);
		Assert.assertEquals("Beetroot - 1 Kg",driver.findElement(ActualText4).getText());  
		System.out.println(driver.findElement(ActualText4).getText());
	}
	
	public void Remove_thirdProduct() {
		waits1(driver,Duration.ofSeconds(10),RemoveProduct);
		WebElement e6= driver.findElement(RemoveProduct);
		clickMethod(e6);	
	}

}
