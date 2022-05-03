package base;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;



public class ScreenBase {
public static AppiumDriver<WebElement>driver;
	
	public static WebDriverWait wait;
	
	public ScreenBase(AppiumDriver<WebElement>driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void hidekeys() {
		driver.hideKeyboard();
		
	}
	
	
	public void showkeyboard() {
		driver.getKeyboard();
		
	}
	public void enter() {
		((AndroidDriver<WebElement>) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
	}
	
	public static void backKeys() {
		((AndroidDriver<WebElement>) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	
public static void scroll(int howManySwipes,AppiumDriver driver2) {
		
		org.openqa.selenium.Dimension size=driver2.manage().window().getSize();
		//calculate coordinates for vertical size
		int startVerticalY=(int)(size.height*0.8);
		int endverticalY=(int)(size.height*0.21);
		int startverticalx=(int)(size.width/2.1);
		try {
			for(int i=1;i<=howManySwipes;i++) {
				new TouchAction(driver2).press(PointOption.point(startverticalx,endverticalY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startverticalx,endverticalY)).release().perform();
			}
		}catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
	}
		

}
