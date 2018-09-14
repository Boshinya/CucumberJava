package com.boshinya.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 * Created by bothees on 12/10/2016.
 */
public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory(){
        intialize();
    }

    private void intialize() {
        if(driver==null){
            createNewDriverInstance();
        }
    }

    private void createNewDriverInstance() {
        if(new PropertyReader().readproperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/schintala/jars/chromedriver");
            //System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
            driver=new ChromeDriver();
        }else{

        }
    }

    public WebDriver getdriver(){
        return driver;
    }

    public static void destroyDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }



}
