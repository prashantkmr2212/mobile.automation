package commonfunctions;

/**
 * This is Helper class for handling common functions and waits on screen
 *
 *
 * @author  Prashant Agrawal
 * @version 1.0
 * @since  20/06/2021
 */
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper {

    public static WebDriverWait wait ;

    public static void tapOnButton(AndroidElement element, AndroidDriver<AndroidElement> driver)
    {
        try {
         wait = new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.elementToBeClickable(element));
         element.click();
        } catch (Exception e) {
            System.out.println("Unable to tap on :"+ element);
        }
    }

    public static void verifyElementIsDisplayed(AndroidElement element, AndroidDriver<AndroidElement> driver)
    {
        try {
            wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.visibilityOf(element));
            Assert.assertTrue(element.isDisplayed());
        } catch (Exception e) {
            System.out.println("Element not displayed :"+ element);
        }
    }




}
