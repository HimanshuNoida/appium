package Screens;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.SelfInjection.Split;

public class HomeScreen extends ScreenBase {

	@AndroidFindBy(xpath = "*//*[@text='Noida - Ghaziabad']")
	public WebElement State;

	@AndroidFindBy(xpath = "*//*[@text='10Th Avenue']")
	public WebElement City;

	@AndroidFindBy(xpath = "*//*[@text='Block A']")
	public WebElement Block;

	@AndroidFindBy(xpath = "*//*[@text='Continue']")
	public WebElement Continue;
	
	

	public HomeScreen(AppiumDriver<WebElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	static String bloc;
	static int size;
	static String CityLocat;
	static String TopBlockk;
	static String TopCityLocation;
	static String TopStateLocation;
	static String Statel;
	static String[] Addresss;
	static String Statell;
	static String Blockk;
	static String CityLocation;
	static String StateLocation;

	public void location() throws InterruptedException {
		Thread.sleep(5000);
		WebElement linearlayout = driver.findElement(By.className("android.widget.FrameLayout"));
//	String text1=linearlayout.findElement(By.xpath("//android.widget.TextView[@text='Please Select Location']")).getText();
//	System.out.println(text1);

		driver.findElement(By.id("in.deerikaexpress.djtretailers:id/city_arrowLcation")).click();
		Thread.sleep(3000);
		State.click();

		driver.findElement(By.id("in.deerikaexpress.djtretailers:id/socity_arrowLocation")).click();
		Thread.sleep(3000);
		City.click();

		driver.findElement(By.id("in.deerikaexpress.djtretailers:id/block_arrowLocation")).click();
		Thread.sleep(3000);
		Block.click();
		Thread.sleep(3000);

		List<WebElement> spinners = driver.findElements(By.id("android:id/text1"));
		size = spinners.size();
		System.out.println("Size=" + " " + size);

		for (int i = 0; i < size; i++) {
			WebElement tttext = spinners.get(i);
			String tr = tttext.getText();
			Addresss = new String[size];
			Addresss[i] = tr;
			// System.out.println(tr);
			if (i == 2) {
				System.out.println("i=" + i);
				Blockk = Addresss[i];
				System.out.println(Blockk);
			}
			if (i == 1) {
				System.out.println("i=" + i);
				CityLocation = Addresss[i];
				System.out.println(CityLocation);
			}

			if (i == 0) {
				System.out.println("i=" + i);
				StateLocation = Addresss[i];
				System.out.println(StateLocation);
			}
		}
		Thread.sleep(3000);
		Continue.click();
		Thread.sleep(3000);

	}

	public static void AddressAssertion() throws InterruptedException {

		WebElement id = driver.findElement(By.id("in.deerikaexpress.djtretailers:id/drawer_layout"));
		WebElement parentid = id.findElement(By.id("in.deerikaexpress.djtretailers:id/locationRelative"));
		String TopAddress = parentid
				.findElement(By.xpath("//android.widget.TextView[@text='Block A 10Th Avenue Noida - Ghaziabad']"))
				.getText();
		System.out.println(TopAddress);
		String[] Address = TopAddress.split(" ");
		int size1 = Address.length;
		System.out.println(size1);
		Addresss = new String[size1];

		for (int j = 0; j < size1; j++) {
			System.out.println(j);
			System.out.println(Address[j]);
			if (j == 0) {
				bloc = Address[j];
				System.out.println(bloc);
			}
			if (j == 1) {
				TopBlockk = bloc + " " + Address[j];
				System.out.println(TopBlockk);
			}
			if (j == 2) {
				CityLocat = Address[j];
			}

			if (j == 3) {
				TopCityLocation = CityLocat + " " + Address[j];
				System.out.println(TopCityLocation);
			}
			if (j == 4) {
				Statel = Address[j];
				System.out.println(Statel);
			}
			if (j == 5) {
				Statell = Address[j];
				System.out.println(Statell);
			}

			if (j == 6) {
				TopStateLocation = Statel + " " + Statell + " " + Address[j];
				System.out.println(TopStateLocation);
			}

		}
		Assert.assertEquals(Blockk, TopBlockk, "The block is same at top address");
		Assert.assertEquals(CityLocation, TopCityLocation, "The location is same at top address");
		Assert.assertEquals(StateLocation, TopStateLocation, "The state is same at top address");
		Thread.sleep(6000);

	}


	public void Navigation() throws InterruptedException {	
		
	//	WebElement i=driver.findElement(By.id("in.deerikaexpress.djtretailers:id/nav_wallet_bottom"));
		
	//    WebElement ty=driver.findElement(By.id("in.deerikaexpress.djtretailers:id/drawer_layout"));
	    Thread.sleep(3000);
	   driver.findElement(By.id("in.deerikaexpress.djtretailers:id/nav_wallet_bottom")).click();
	   Thread.sleep(3000);
	   LoginpopupValidation();
	   backKeys();
      driver.findElement(By.id("in.deerikaexpress.djtretailers:id/nav_myOrder_bottom")).click();
      Thread.sleep(3000);
      LoginpopupValidation();
	   backKeys();
	   driver.findElement(By.id("in.deerikaexpress.djtretailers:id/nav_support_bottom")).click();
	   Thread.sleep(3000);
	   LoginpopupValidation();
	   backKeys();
	   
	   
	 
	/*
	for(int s=0;s<size;s++) {
		WebElement element=ty1.get(s);
	String t=element.findElement(By.id("in.deerikaexpress.djtretailers:id/nav_home_bottom")).getAttribute("in.deerikaexpress.djtretailers:id/nav_home_bottom");
	if(t.contains("in.deerikaexpress.djtretailers:id/nav_home_bottom")) {
		System.out.println("t="+t);
		break;
		
	}
	*/	Thread.sleep(3000);
		//hidekeys();
		//Thread.sleep(3000);
		backKeys();
		Thread.sleep(4000);
	
	}

	public void LoginpopupValidation() {
		
	     WebElement Login=driver.findElement(By.className("android.widget.ScrollView"));
        if(Login.isDisplayed()) {
        	System.out.println("The Dialog box get opened and asking for login");
        
        String LLogin= Login.findElement(By.xpath("//android.widget.TextView[@text='Login ']")).getText();
        System.out.println(Login);
        }
        
        
        
		
	}
	
	
	
	}

//}
