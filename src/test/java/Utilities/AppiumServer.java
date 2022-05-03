package Utilities;

import java.io.File;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumServer {
	
	public static AppiumDriverLocalService server;
	public static void start() {
	
		AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder().usingPort(4723);
	    server = AppiumDriverLocalService.buildService(serviceBuilder);
		server.start();
		
//		C:\Users\Dell\AppData\Roaming\npm\node_modules\appium\build\lib
		
		
	}
	
	
	public static void stop() {
	  server.stop();
	}
	
}
