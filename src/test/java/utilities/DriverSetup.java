package utilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import pages.ExtentsReports1;


public class DriverSetup extends ExtentsReports1{
    private static final ThreadLocal<AndroidDriver> LOCAL_DRIVER = new ThreadLocal<>();
    public static void setDriver(AndroidDriver driver){
        DriverSetup.LOCAL_DRIVER.set(driver);
    }
    public static AndroidDriver getDriver(){
        return LOCAL_DRIVER.get();
    }
    public static AndroidDriver getApp() throws MalformedURLException{
    	File f = new File("src\\test\\resources");
        File apk = new File(f, "nopstationCart_4.40 1.apk");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:deviceName", "Mobile");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        
        desiredCapabilities.setCapability("appium:udid", "emulator-5554");
        desiredCapabilities.setCapability("app", apk.getAbsolutePath());
        URL remoteUrl = new URL("http://127.0.0.1:4723");
        return new AndroidDriver(remoteUrl, desiredCapabilities);
    	
    }

    public static synchronized void setBrowser() throws MalformedURLException{
       AndroidDriver driver = getApp();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       setDriver(driver);
    }

    public static synchronized void quiteBrowser(Scenario scenario){
        takeScreenShot(scenario);
        getDriver().quit();
    }

    public static void takeScreenShot(Scenario scenario){
        if (scenario.isFailed()){
            String name = scenario.getName().replaceAll(" ", "_");
            byte[] source = ((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(source, "image/png", name);
        }
    }
}
