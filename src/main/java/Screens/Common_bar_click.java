package Screens;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Common_bar_click extends ScreenBase {

	@AndroidBy(id = "com.flipkart.android:id/flyout_recycler_view")
	public static WebElement number;

	@AndroidBy(xpath = "//android.widget.LinearLayout[@class='android.widget.LinearLayout']")
	public static By number_ofelements;

	public Common_bar_click(AppiumDriver<WebElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public static void Homeclickbar() throws InterruptedException {

		driver.findElement(By.className("android.widget.ImageButton")).click();
		Thread.sleep(3000);

	}

	public static void different_Screens() throws InterruptedException {
		Homeclickbar();
		Thread.sleep(5000);
	/*int size=number_ofelements.size();
	System.out.println("size="+size);
	
	for(int i=1;i<size;i++) {
		number_ofelements.get(i).click();
		Thread.sleep(4000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Homeclickbar();
		Thread.sleep(4000);
		*/
	
	WebElement drawer=driver.findElement(By.id("com.flipkart.android:id/drawer_layout"));
	WebElement drawer1=drawer.findElement(By.id("com.flipkart.android:id/flyout_navigation_view"));
    WebElement element=drawer1.findElement(By.id("com.flipkart.android:id/flyout_recycler_view"));
	List<WebElement>Allelements=element.findElements(By.className("android.widget.LinearLayout"));
	int size=Allelements.size();
	System.out.println(size);

	System.out.println("HY");
	for(int i=0;i<=size-1;i++) {
	
		
		
	
/*		System.out.println("i="+i);
		Allelements.get(i).click();
		Thread.sleep(3000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		Homeclickbar();
	*/	
	
		
		System.out.println("In try block");
		System.out.println("i="+i);
		
	WebElement item=Allelements.get(i);

	try {	
		
		item.findElement(By.id("com.flipkart.android:id/flyout_parent_container")).click();
		
	Thread.sleep(4000);
	if(i==17) {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	}
	if(i==16) {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(3000);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		
	}
	Thread.sleep(4000);
	((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(4000);
	Homeclickbar();
		}
	
/*	if(i==16) {
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(5000);
		Homeclickbar();
		
	}*/
	
	catch (Exception e) {
    	System.out.println("In catch block ");
    	System.out.println("i="+i);
		System.out.println("There is not child of this element");
		
	}
	
	
	}//end of for loop
	
	}
}
//}
