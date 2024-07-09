package test_Cases;

import org.testng.annotations.Test;
import web_Pages.ScenarioPage_5;

public class ScenarioTest_5 extends driverClass{
		@Test
		public void Scenario_5() throws InterruptedException{
			ScenarioPage_5 s5 =new ScenarioPage_5(driver);
			s5.Click_FlightBooking();
			s5.Click_Country();
			s5.Enter_Country();
			s5.Click_radioBtn();
			s5.Click_DepartureCity();
			s5.Click_ArrivalCity();
			s5.Click_DepartDate();
			s5.Select_DepartDate();
			s5.Click_ReturnDate();
			s5.Select_ReturnDate();
			s5.Click_Passengers();
			s5.Click_Adult();
			s5.Click_Child();
			s5.Click_Infant();
			s5.Click_Done();
			s5.Click_Currency();
			s5.Click_Fam_frnds();
			s5.Click_Searchbtn();
			

	}

}
