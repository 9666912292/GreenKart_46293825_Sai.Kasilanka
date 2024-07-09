package test_Cases;

import org.testng.annotations.Test;
import web_Pages.ScenarioPage_2;

public class ScenarioTest_2 extends driverClass {
	@Test
	public void Scenario_2() throws InterruptedException{
		ScenarioPage_2 s2 =new ScenarioPage_2(driver);
		s2.Clicking_item2();
		s2.Clicking_item3();
		s2.Clicking_item4();
		s2.Clicking_cart1();
		s2.validation_ActualText2();
		s2.validation_ActualText3();
		s2.validation_ActualText4();
		s2.Remove_thirdProduct();
		

}
}
