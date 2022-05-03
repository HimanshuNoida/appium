package Deerika.testcase.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Screens.HomeScreen;
import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.testbase;

public class HomePPage extends testbase {

	HomeScreen homescreen;

	@BeforeTest
	public void setup() {

		setUp();
		homescreen = new HomeScreen(driver);

	}
	
	@Test(priority = 1,enabled = false)
	public void Location() throws InterruptedException {

		homescreen.location();
	}

	@Test(priority = 2,enabled = false)
	public void LocationAssertion() throws InterruptedException {
		homescreen.AddressAssertion();
	}

	@Test(priority = 3,enabled = false)
	public void Navigation() throws InterruptedException {
		homescreen.Navigation();
	}
}
