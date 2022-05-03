package HomePageLandin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Screens.Common_bar_click;
import Screens.Login_screen;
import testBase.testbase;

public class HomeLandinPage extends testbase{
	Common_bar_click landing;
	
	@BeforeTest
	public void init() {
		setUp();
		landing=new Common_bar_click(driver);
		
	}
	
	@Test
	public  void homebar() throws InterruptedException {
	/*	
		Thread.sleep(9000);
		landing.different_Screens();
		return this;
		*/
	}
	
}
