import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.MobileElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class Mytest { 

	@iOSXCUITFindBy(accessibility="Button 1")
	private MobileElement button1;
	
	@iOSXCUITFindBy(accessibility="Button 2")
	private MobileElement button2;
	
	@iOSXCUITFindBy(accessibility="Button 3")
	private MobileElement button3;
	
	public void run() throws MalformedURLException {
    	System.out.println("Hello Appium!"); 
    	File app = new File("/Users/wenhai.pan/Library/Developer/Xcode/DerivedData/appium_ios-gcdebiihuqfvkjdzcwbyrpdhooyv/Build/Products/Debug-iphonesimulator/appium_ios.app");
        
        String deviceName = "iPhone 8";
        String platformName = "iOS";
        String automationName = "XCUITest";
        String platformVersion = "12.4";
        URL appium_server_url = new URL("http://0.0.0.0:4723/wd/hub");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("automationName", automationName);
        capabilities.setCapability("app", app.getAbsolutePath());

        //AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        //service.start();
        //System.out.println("appium service started!");
        //System.out.println(service.getUrl());
        
        IOSDriver<MobileElement> driver = new IOSDriver<MobileElement>(appium_server_url, capabilities); 
        System.out.println("driver initiated!");
        
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
        List<MobileElement> buttons = driver.findElementsByAccessibilityId("Button 1");
        System.out.println(buttons.size());
        
        buttons.get(0).click();
        System.out.println("click button 1!");

        this.button1.click();
        System.out.println("click button 1!");
        
        this.button2.click();
        System.out.println("click button 2!");
        
        this.button3.click();
        System.out.println("click button 3!");

	}
}