package test_Cases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import web_Pages.ScenarioPage_3;

public class ScenarioTest_3 extends driverClass {
		@Test(dataProvider="getData")
		public void Scenario_3(String SearchProduct) throws InterruptedException{
			ScenarioPage_3 s3 =new ScenarioPage_3(driver);
			s3.Clicking_item5();
			s3.Clicking_item6();
			s3.Clicking_item7();
			s3.Clicking_cart();
			s3.validation_ActualText5();
			s3.validation_ActualText6();
			s3.validation_ActualText7();
			s3.Click_searchFeild();
			s3.Search_products(SearchProduct);
			s3.Click_SearchButton();
			s3.Increase_Product1();
			s3.Click_AddToCart();
			s3.click_CartPage();
			s3.validation_ActualText1();
			s3.validation_ActualPrice1();
			s3.Remove_Product3();
	}
		@DataProvider
		public Object[][] getData(){
			String sheetname= "GreenKart_web";
			int rows = excel.getRowCount(sheetname);
			int cols =excel.getColumnCount(sheetname);
			
			Object [][] data = new Object[rows -1][cols];
			for (int rowNum =2; rowNum<=rows; rowNum++) {
				for(int colNum =0; colNum<cols; colNum++) {
					data[rowNum-2][colNum]= excel.getCellData(sheetname, colNum, rowNum);
				}
			}
			return data;
		}
}
