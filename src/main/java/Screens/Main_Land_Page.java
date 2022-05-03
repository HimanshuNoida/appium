package Screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Main_Land_Page extends ScreenBase {

	
	
	public Main_Land_Page(AppiumDriver<WebElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static offerZone offer_Zone() {
	WebElement offerzone=driver.findElement(By.className("android.widget.HorizontalScrollView"));
	offerzone.findElement(By.xpath("//sandroid.view.ViewGroup[@class='android.view.ViewGroup'][1]")).click();
	return new offerZone(driver);

	}

	public static grocery grocery1() {
		WebElement grocery=driver.findElement(By.className("android.widget.HorizontalScrollView"));
		grocery.findElement(By.xpath("//sandroid.view.ViewGroup[@class='android.view.ViewGroup'][2]")).click();
		return new grocery(driver);

	}

	public static Mobiles mobiles() {
		WebElement mobiles=driver.findElement(By.className("android.widget.HorizontalScrollView"));
		mobiles.findElement(By.xpath("//sandroid.view.ViewGroup[@class='android.view.ViewGroup'][3]")).click();
		return new Mobiles(driver);

	}

	
	public static fashions fashions() {
		WebElement fashions=driver.findElement(By.className("android.widget.HorizontalScrollView"));
		fashions.findElement(By.xpath("//sandroid.view.ViewGroup[@class='android.view.ViewGroup'][4]")).click();
		return new fashions(driver);
	}

	
	
}
