package Deerika.testcases.LeftMenuPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Screens.HomeScreen;
import Screens.Main_Menu_leftmenusceeen;
import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.testbase;

public class Myorders extends testbase {

	Main_Menu_leftmenusceeen order;

	@BeforeTest
	public void setup() {

		setUp();
		order = new Main_Menu_leftmenusceeen(driver);

	}

	@Test
	public void myOrders() throws InterruptedException {
		order.MainMenu();
	
	}
}
