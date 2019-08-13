import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main { 
    public static void main(String args[]) throws MalformedURLException { 

    	Mytest test = new Mytest();

    	System.out.println("before test run");
    	test.run();
    	System.out.println("after test run");

    } 
}