package com.boshinya.pageobjects;

import com.boshinya.utilities.PropertyReader;
import cucumber.api.java.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by bothees on 11/10/2016.
 */
public class Login {

    private WebDriver driver;

    PropertyReader prp = new PropertyReader();

    private String url = prp.readproperty("login.url") ;
    private String username = prp.readproperty("login.username");
    private String password = prp.readproperty("login.password") ;

    public Login(WebDriver driver){
        this.driver=driver;
    }

    public void goToLoginpage(){
        driver.manage().window().maximize();
        driver.get(url);
    }

    public void enteruserName(){
        driver.findElement(By.id("emailAddress")).sendKeys(username);
    }

    public void enteruserPassword(){
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(By.id("signInButton")).click();
    }

    public String verifyHomepage(){
        String text = driver.findElement(By.id("welcome-name")).getText();
        System.out.println("Actual String:"+text);
        return text;
    }

}
