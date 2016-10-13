package com.boshinya.stepdefinitions;

import com.boshinya.pageobjects.Login;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.Assert.*;
/**
 * Created by bothees on 11/10/2016.
 */
public class Loginsteps {

    public WebDriver driver = new FirefoxDriver();

    private static String expectedstring = "Boothiraj";

    Login login = new Login(driver);

    @Given("^user am on LoginPage$")
    public void user_am_on_LoginPage() throws Throwable {
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
    public void teardown(){
        driver.close();
    }

}
