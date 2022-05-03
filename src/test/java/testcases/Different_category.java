package testcases;

import org.testng.annotations.Test;

import Screens.Common_bar_click;
import Screens.Login_screen;
import Screens.Main_Land_Page;
import testBase.testbase;

public class Different_category extends testbase {
	
	Main_Land_Page MLandinPage;
	public void iniilization() {
	setUp();
	MLandinPage=new Main_Land_Page(driver);
	
}
	@Test
	public void offer_Zone() {
	MLandinPage.grocery1();
	}
	

}
