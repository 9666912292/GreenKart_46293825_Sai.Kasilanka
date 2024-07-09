package web_Pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import test_Cases.driverClass;

public class BasePage extends driverClass {
	
	public  void clickMethod(WebElement element) {
		element.click();
	}
	
	public void sendkeys(WebElement ele1,String s) {
		ele1.sendKeys(s);
	}
	public String gettext(WebElement e3) {
		return e3.getText();
	}
	public  void dropdown(WebElement ele,String str) {
		Select s=new Select(ele);
		s.selectByVisibleText(str);
	}
	
	/*public  void Clear_quantity(WebElement e5) {
		e5.clear();
	}*/
	
	public void waits1(WebDriver driver,Duration time,By loc) {
		WebDriverWait wait = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
}






/*public  void Clear_quantity(WebElement e5) {
e5.clear();
}

public  void sendkeys(WebElement e4, String s) {
e4.click();
}

public String gettext(WebElement e3) {
return e3.getText();
}

public void waits1(WebDriver driver,Duration time,By loc) {
WebDriverWait wait = new WebDriverWait(driver,time);
wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
}*/

/*
from_dp = driver.find_element_by_xpath("//input[@id='from']")
from_dp.click()
time.sleep(5)

from_month = driver.find_element_by_xpath("//div/select[@class='ui-datepicker-month']")
selected_from_month = Select(from_month)
selected_from_month.select_by_visible_text("Jan")
time.sleep(5)

# from_day = driver.find_element_by_xpath("//table/tbody/tr/td/a[text()='20']")
from_day = driver.find_element_by_xpath("//td[not(contains(@class,'ui-datepicker-month'))]/a[text()='" + expected_fr_date + "']")
from_day.click()
time.sleep(10)*/
