package testBase;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.AppiumServer;
import Utilities.CommonUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class testbase {

	public static AppiumDriver driver;
	
	public static String loadProperyFile = "Android_Deerika.properties";
	public static String loadProperyFile_Deerika = "Android_Deerika.properties";
	public static Logger log = Logger.getLogger(testbase.class);
    WebDriverWait wait;
	public void setUp() {

		if (driver == null) {
			// PropertyConfigurator
			// .configure(System.getProperty("user.dir") +
			// "\\src\\test\\resources\\Properties\\log4j.properties");
			if (loadProperyFile.startsWith("Android_")) {

		//		wait=new WebDriverWait(driver, 40000);
				AppiumServer.start();
				log.info("Appium server started");
				CommonUtils.loadAndroidConofProp(loadProperyFile_Deerika);
				log.info(loadProperyFile + "Properties file loaded");
				CommonUtils.setAndroidCapabalities();
				driver = CommonUtils.getAndroidriver();
			} else if (loadProperyFile.startsWith("IOS_")) {

			}

		}

	}

	public void quit() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		log.info("Test case execution completed");
		AppiumServer.stop();
		log.info("Appium server stopped");
	}

	public static AndroidElement scroll(By by, AndroidDriver driver) {
		AndroidElement element = null;
		int numberoftimes = 10;
		org.openqa.selenium.Dimension size = driver.manage().window().getSize();

		int anchor = (int) (size.width / 2);
		/// swipe to scroll down
		int endPoint = 10;
		int startPoint = (int) (size.height - 10);
		for (int i = 0; i < numberoftimes; i++) {
			try {
				new TouchAction(driver).longPress(PointOption.point(anchor, startPoint))
						// waitAction(waitOptions(of Millis(miliseconds)))
						.moveTo(PointOption.point(anchor, endPoint)).release().perform();
				element = (AndroidElement) driver.findElement(by);
				// i=numberoftimes;

			} catch (NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(String.format("Element not available. Scrolling (%s) times", i + 1));
			}
		}
		return element;
	}

	public static void scrollUp(int howManySwipes, AppiumDriver driver2) {

		org.openqa.selenium.Dimension size = driver2.manage().window().getSize();
		// calculate coordinates for vertical size
		int startVerticalY = (int) (size.height * 0.8);
		int endverticalY = (int) (size.height * 0.21);
		int startverticalx = (int) (size.width / 2.1);
		try {
			for (int i = 1; i <= howManySwipes; i++) {
				new TouchAction(driver2).press(PointOption.point(startverticalx, startVerticalY))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
						.moveTo(PointOption.point(startverticalx, endverticalY)).release().perform();
			}
		} catch (Exception e) {
			// TODO: handle exception

		}

	}

	public static void scrollDown(int howManySwipes,AndroidDriver<WebElement> driver2) {

		org.openqa.selenium.Dimension size = driver2.manage().window().getSize();
		// calculate coordinates for vertical size
		int startVerticalY = (int) (size.height * 0.8);
		int endverticalY = (int) (size.height * 0.21);
		int startverticalx = (int) (size.width / 2.1);
		try {
			for (int i = 1; i <= howManySwipes; i++) {
				new TouchAction(driver2).press(PointOption.point(startverticalx, endverticalY))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
						.moveTo(PointOption.point(startverticalx, endverticalY)).release().perform();
			}
		} catch (Exception e) {
			// TODO: handle exception

		}

	}
}
