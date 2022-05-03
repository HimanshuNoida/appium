package testcases;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Home.testcases.flipkart.Home;
import HomePageLandin.HomeLandinPage;
import Screens.Common_bar_click;
import Screens.Login_screen;
import io.appium.java_client.FindsByAndroidUIAutomator;
import testBase.testbase;


public class FlipkartLogin extends testbase{
	
    public static Login_screen login;
	public static Common_bar_click coommon_bar;
	
	
	@BeforeTest
	public void init() {
		setUp();
		 login=new Login_screen(driver);
		 coommon_bar=new Common_bar_click(driver);
		
	}
	
	@Test
	public static void loginTest() throws InterruptedException {
		login.log_In();
		
	}
	
	
	@Test(priority = 1)
	public static void common_Bar_Test_Screens() throws InterruptedException {
		
		coommon_bar.different_Screens();
	}
	
	
	
	
	
		
			
	}


//}
