package commonfunctions;

/**
 * This is Base class for initialization and app launch
 *
 *
 * @author  Prashant Agrawal
 * @version 1.0
 * @since 20/06/2021
 */


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;


public class Base {

    public static AndroidDriver driver;
    private static String basePath=System.getProperty("user.dir");
    private static String pathofEnvironmentFile=basePath+"\\src\\test\\resources\\testconfig\\Environment.properties";

    public WebDriver initialize(String deviceName, String platformName, String platformVersion) throws Exception
    {
        String appLocation=Utility.readPropertyFile(pathofEnvironmentFile,"appLocation");
        String appPackage=Utility.readPropertyFile(pathofEnvironmentFile,"appPackage");
        String appActivity=Utility.readPropertyFile(pathofEnvironmentFile,"appActivity");
        String appWaitActivity=Utility.readPropertyFile(pathofEnvironmentFile,"appWaitActivity");
        String hostName=Utility.readPropertyFile(pathofEnvironmentFile,"hostName");
        String port=Utility.readPropertyFile(pathofEnvironmentFile,"port");
        String noReset=Utility.readPropertyFile(pathofEnvironmentFile,"noReset");
        String fullReset=Utility.readPropertyFile(pathofEnvironmentFile,"fullReset");


        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName",deviceName);
        capabilities.setCapability("platformName",platformName);
        capabilities.setCapability("platformVersion",platformVersion);
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app",appLocation);
        capabilities.setCapability("appPackage",appPackage);
        capabilities.setCapability("appActivity",appActivity);
        capabilities.setCapability("appWaitActivity",appWaitActivity);
        capabilities.setCapability("noReset", noReset);
        capabilities.setCapability("fullReset", fullReset);

        driver=new AndroidDriver<MobileElement>(new URL("http://" + hostName + ":" + port + "/wd/hub"),capabilities);
        return driver;
    }

    public static AndroidDriver getCurrentDriver()
    {
        return Base.driver;
    }

}
