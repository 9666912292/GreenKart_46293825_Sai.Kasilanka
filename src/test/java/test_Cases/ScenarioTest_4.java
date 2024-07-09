package test_Cases;

import org.testng.annotations.Test;
import web_Pages.ScenarioPage_4;

public class ScenarioTest_4 extends driverClass{
	@Test
	public void Scenario_4() throws InterruptedException{
		ScenarioPage_4 s4 =new ScenarioPage_4(driver);
		s4.RemoveProduct4();
		s4.Check_out();
		s4.Click_Apply();
		s4.Error_msg();
		s4.EnterPromoCode();
		s4.Click_Applybutton();
		s4.Invalid_Code();
		s4.place_Order();
		s4.Select_country();
		s4.Click_checkBox();
		s4.Click_Proceed();
	}
	
		


}
