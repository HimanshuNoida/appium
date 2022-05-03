package Home.testcases.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePageLandin.HomeLandinPage;
import Screens.Login_screen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;
import testBase.testbase;

public class Home extends testbase{
	//public static AndroidDriver driver;
	
	Login_screen home;
	
	@BeforeTest
	public void init() {
		setUp();
		home=new Login_screen(driver);
		
	}
	
	

	public HomeLandinPage Language_choosen() throws InterruptedException {
		String lanuguage_choosen="English";
		Thread.sleep(2000);
			((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
							+ lanuguage_choosen + "\").instance(0))");
	//	home.log_In();
		return new HomeLandinPage();
		
			
	}
	
	
	


}
