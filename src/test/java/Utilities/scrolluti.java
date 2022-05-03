package Utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class scrolluti{
	
	 static AndroidElement scroll(By by,AndroidDriver driver) {
		AndroidElement element=null;
		int numberoftimes=10;
		org.openqa.selenium.Dimension size=driver.manage().window().getSize();
		
		int anchor=(int)(size.width/2);
		///swipe to scroll down
		int endPoint=10;
		int startPoint=(int)(size.height-10);
		for(int i=0;i<numberoftimes;i++) {
			try {
				new TouchAction(driver)
				.longPress(PointOption.point(anchor,startPoint))
				//waitAction(waitOptions(of Millis(miliseconds)))
				.moveTo(PointOption.point(anchor,endPoint)).release().perform();
				element=(AndroidElement)driver.findElement(by);
			//	i=numberoftimes;
				
			}catch (NoSuchElementException e) {
				// TODO: handle exception
				System.out.println(String.format("Element not available. Scrolling (%s) times",i+1));
			}
		}
		return element;	
	}
	
	public static  void scrollUp(int howManySwipes,AndroidDriver driver) {
		
		org.openqa.selenium.Dimension size=driver.manage().window().getSize();
		//calculate coordinates for vertical size
		int startVerticalY=(int)(size.height*0.8);
		int endverticalY=(int)(size.height*0.21);
		int startverticalx=(int)(size.width/2.1);
		try {
			for(int i=1;i<=howManySwipes;i++) {
				new TouchAction(driver).press(PointOption.point(startverticalx,startVerticalY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startverticalx,endverticalY)).release().perform();
			}
		}catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
	}
	
public static  void scrollDown(int howManySwipes,AndroidDriver driver) {
		
		org.openqa.selenium.Dimension size=driver.manage().window().getSize();
		//calculate coordinates for vertical size
		int startVerticalY=(int)(size.height*0.8);
		int endverticalY=(int)(size.height*0.21);
		int startverticalx=(int)(size.width/2.1);
		try {
			for(int i=1;i<=howManySwipes;i++) {
				new TouchAction(driver).press(PointOption.point(startverticalx,endverticalY))
				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(2000))).moveTo(PointOption.point(startverticalx,endverticalY)).release().perform();
			}
		}catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
	}



}
