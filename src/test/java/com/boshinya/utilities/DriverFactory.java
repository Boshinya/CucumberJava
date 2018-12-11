package com.boshinya.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        String workingDir = System.getProperty("user.dir");
        if(new PropertyReader().readproperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",workingDir+ "/chromedriver");
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
