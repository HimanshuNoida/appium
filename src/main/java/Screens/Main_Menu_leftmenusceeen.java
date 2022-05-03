package Screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Main_Menu_leftmenusceeen extends ScreenBase {

	public Main_Menu_leftmenusceeen(AppiumDriver<WebElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@class='android.widget.ImageButton']")
	public static WebElement menuTopbar;

	@AndroidFindBy(xpath = "//android.widget.RelativeLayout[@class='android.widget.RelativeLayout']")
	public static List<WebElement> menu;

	public static void MainMenu() throws InterruptedException {
		menuTopbar.click();
		Thread.sleep(4000);
		int size = menu.size();
		System.out.println("Size=" + size);
		for (int a = 0; a < size; a++) {
			WebElement element = menu.get(a);
			String item = element.findElement(By.id("in.deerikaexpress.djtretailers:id/sideYourOrder_tv")).getText();
			System.out.println(item);
			element.click();

			Thread.sleep(3000);
			backKeys();
			Thread.sleep(3000);
			menuTopbar.click();
			Thread.sleep(3000);
		}

	}

}
