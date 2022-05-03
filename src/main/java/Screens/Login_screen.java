package Screens;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Login_screen extends ScreenBase {

	@AndroidFindBy(xpath = "*//*[@text='English']")
	public static WebElement text;

	
	@AndroidFindBy(id="com.flipkart.android:id/phone_input")
	public static WebElement phonenumber;
	
	@AndroidFindBy(xpath = "*//*[@text='CONTINUE']")
	public static WebElement continuee;
	
	
	
	public Login_screen(AppiumDriver<WebElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public static void scrollDown(int howManySwipes, AppiumDriver<WebElement> driver) {

		org.openqa.selenium.Dimension size = driver.manage().window().getSize();
		// calculate coordinates for vertical size
		int startVerticalY = (int) (size.height * 0.8);
		int endverticalY = (int) (size.height * 0.21);
		int startverticalx = (int) (size.width / 2.1);
		try {
			for (int i = 1; i <= howManySwipes; i++) {
				new TouchAction(driver).press(PointOption.point(startverticalx, endverticalY))
						.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000)))
						.moveTo(PointOption.point(startverticalx, endverticalY)).release().perform();
			}
		} catch (Exception e) {
			// TODO: handle exception

		}

	}

	public static Common_bar_click log_In() throws InterruptedException {
		String lanuguage_choosen="English";
		Thread.sleep(2000);
			((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
							+ lanuguage_choosen + "\").instance(0))");

		text.click();
		continuee.click();
		Thread.sleep(5000);
 //      wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.flipkart.android:id/phone_input")));
	//	phonenumber.click();
		
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_9));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_4));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_2));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_1));
		Thread.sleep(5000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		Thread.sleep(9000);
		return new Common_bar_click(driver);
	}
}
