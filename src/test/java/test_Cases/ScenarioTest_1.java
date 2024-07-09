package test_Cases;

import org.testng.annotations.Test;
import web_Pages.ScenarioPage_1;

public class ScenarioTest_1 extends driverClass{
	@Test
	public void Scenario_1(){
		ScenarioPage_1 s1 =new ScenarioPage_1(driver);
		s1.Clicking_10thitem();
		s1.Clicking_cart();
		s1.validation_ActualText();
		s1.validation_ActualPrice();
		
	}

}
