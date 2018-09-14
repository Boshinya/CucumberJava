package com.boshinya.pageobjects;

import com.boshinya.utilities.DriverFactory;
import com.boshinya.utilities.PropertyReader;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by bothees on 11/10/2016.
 */
public class Login {

    private WebDriver driver;

    @FindBy(id = "emailAddress")
    private WebElement usrname;

    @FindBy(id = "password")
    private WebElement passwd;

    @FindBy(id = "signInButton")
    private WebElement signin;

    @FindBy(xpath = "//*[@id='content-wrap']/div/div/section/header/div[1]/h1")
    private WebElement loginHead;

    PropertyReader prp = new PropertyReader();
    Common common = new Common();

    private String url = prp.readproperty("login.url") ;
    private String username = prp.readproperty("login.username");
    private String password = prp.readproperty("login.password") ;

    public Login(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void goToLoginpage(){
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void enteruserName(){
        usrname.sendKeys(username);
    }

    public void enteruserPassword(){
        passwd.sendKeys(password);
    }

    public void clickLoginButton(){
        signin.click();
    }

    public String verifyHomepage(){
        String text = common.waitForVisibilityOfElement(loginHead).getText();
        System.out.println("Actual String:"+text);
        return text;
    }



}
