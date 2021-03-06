package com.boshinya.stepdefinitions;

import com.boshinya.pageobjects.Common;
import com.boshinya.pageobjects.Login;
import com.boshinya.utilities.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

/**
 * Created by bothees on 11/10/2016.
 */
public class Loginsteps extends DriverFactory{

    final static Logger logger = Logger.getLogger(Homepagesteps.class);

    private static String expectedstring = "Boothiraj";

    Login login = new Login(driver);

    @Before
    public void setup(){
        driver = new DriverFactory().getdriver();
    }

    @Given("^user am on LoginPage$")
    public void user_am_on_LoginPage() throws Throwable {
        logger.info("opening the login page");
        login.goToLoginpage();
    }

    @When("^user enter valid username$")
    public void user_enter_valid_username() throws Throwable {
        login.enteruserName();
    }

    @When("^user enter valid password$")
    public void user_enter_valid_password() throws Throwable {
        login.enteruserPassword();
    }
    @When("^user click on login button$")
    public void user_click_on_login_button() throws Throwable {
        login.clickLoginButton();
    }

    @Then("^user should see the homepage$")
    public void user_should_see_the_homepage() throws Throwable {
        Assert.assertEquals(expectedstring,login.verifyHomepage());
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png"); //stick it in the report
        }
        DriverFactory.destroyDriver();
    }

}
