package pageobjects;

import commonfunctions.Base;
import commonfunctions.Helper;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class WelcomeScreen extends Base {

    @AndroidFindBy(id = "button_classic")
    AndroidElement signInButton;

    @AndroidFindBy(id = "button_google")
    AndroidElement signInGoogleButton;

    public WelcomeScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void tapOnSignInButton()  {
        Helper.tapOnButton(signInButton, driver);
    }

    public void verifySignInGoogleButton() {
        Helper.verifyElementIsDisplayed(signInGoogleButton, driver);
    }
}
