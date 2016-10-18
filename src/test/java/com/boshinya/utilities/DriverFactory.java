package com.boshinya.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
        if(new PropertyReader().readproperty("browser").equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
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
