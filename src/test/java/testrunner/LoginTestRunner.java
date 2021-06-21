package testrunner;


/**
 * This is login runner class to execute test
 *
 *
 * @author  Prashant Agrawal
 * @version 1.0
 * @since  20/06/2021
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"}
                ,glue={"stepdefinitions"}
)
public class LoginTestRunner {

}
