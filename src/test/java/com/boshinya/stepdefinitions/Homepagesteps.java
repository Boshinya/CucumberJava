package com.boshinya.stepdefinitions;

import com.boshinya.pageobjects.Homepage;
import com.boshinya.pageobjects.Login;
import com.boshinya.utilities.DriverFactory;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/**
 * Created by bothees on 11/10/2016.
 */
public class Homepagesteps extends DriverFactory{



    Homepage home = new Homepage(driver);
    @Before
    public void setup(){
        driver = new DriverFactory().getdriver();
    }

    @Given("^user logged on Homepage$")
    public void user_logged_on_Homepage() throws Throwable {
        Login login = new Login(driver);
        login.goToLoginpage();
        login.enteruserName();
        login.enteruserPassword();
        login.clickLoginButton();
    }

    @Given("^click on All history menu$")
    public void click_on_All_history_menu() throws Throwable {
        home.clickonhistorybutton();
    }

    @Then("^user should see all the information$")
    public void user_should_see_all_the_information() throws Throwable {
        Assert.assertTrue("verified",home.verifyhistory());
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
