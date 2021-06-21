package stepdefinitions;

import commonfunctions.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.WelcomeScreen;

public class LoginStep {

    public Base baseObj;
    public WelcomeScreen loginObj;

    public LoginStep() {
        baseObj = new Base();
    }

    @When("^I launch ebay app on device \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
    public void iLaunchEbayAppOnDevice(String deviceName, String platformName, String platformVersion) throws Throwable {
        baseObj.initialize(deviceName, platformName, platformVersion);
    }

    @And("^I click on sign in button$")
    public void iClickOnSignInButton() throws Exception {
        loginObj = new WelcomeScreen();
        loginObj.tapOnSignInButton();
    }

    @Then("^I verify sign in with google option is displayed$")
    public void iVerifySignInWithGoogleOptionIsDisplayed() throws Exception {
        loginObj.verifySignInGoogleButton();
    }

}
