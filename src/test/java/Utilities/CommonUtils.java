package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.DrbgParameters.Capability;
import java.util.Properties;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.mongodb.connection.Server;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class CommonUtils {

	private static AndroidDriver<MobileElement> driver;
    private static URL serverUrl;
    private static DesiredCapabilities capabilities=new DesiredCapabilities();
 
    public static String APPIUM_PORT;
    private static int IMPLICIT_WAIT_TIME;
    private static int EXPLICIT_WAIT_TIME;
    private static String BASE_PKG;
    private static String APP_ACTIVITY;
    private static String APP_PATH;
    private static String BROWSER_NAME;
    private static String PLATFORM_NAME;
    private static String PLATFORM_VERSION;
    private static String DEVICE_NAME;
    private static String UDID;
    private static String BUNDLE_ID;
    private static String APP;
    
    private static Properties prop=new Properties();
	public static FileInputStream fis;
    public static void loadAndroidConofProp(String loadProperyFile) {
		// TODO Auto-generated method stub
    	
    	try {
		fis=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/properties/"+loadProperyFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	IMPLICIT_WAIT_TIME=Integer.parseInt(prop.getProperty("implicit.wait"));
    	EXPLICIT_WAIT_TIME=Integer.parseInt(prop.getProperty("explicit.wait"));
    	BASE_PKG=prop.getProperty("base.pkg");
        APP_ACTIVITY=prop.getProperty("application.activity");
        APP_PATH=prop.getProperty("application.path");
        BROWSER_NAME=prop.getProperty("brwoser");
        PLATFORM_NAME=prop.getProperty("platform.name");
        PLATFORM_VERSION=prop.getProperty("platform.version");
    	DEVICE_NAME=prop.getProperty("device_name");
    	APPIUM_PORT=prop.getProperty("appium.server.port");
    	
	}

	public static void setAndroidCapabalities() {
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,BASE_PKG );
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY);

		
	
	}

	public static void loadIOSConofProp(String loadProperyFile) {
		// TODO Auto-generated method stub

	}

	public static void setIOSCapabalities() {

		
	}

	public static AndroidDriver<MobileElement> getAndroidriver() {
		try {
			serverUrl=new URL("http://localhost:"+APPIUM_PORT+"/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver=new AndroidDriver<MobileElement>(serverUrl,capabilities);
		return driver;

	}

	public static AppiumDriver<MobileElement> getIOSdriver() {
		return driver;

	}

}
