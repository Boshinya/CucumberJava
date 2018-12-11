package com.boshinya.utilities;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Collections;
import java.util.HashMap;

/**
 * Created by bothees on 12/10/2016.
 */
public class DriverFactory {

    protected static WebDriver driver;
    String workingDir = System.getProperty("user.dir");

    private static ChromeOptions options;

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
            DesiredCapabilities capabilities = getChromeDesiredCapabilities();
            ChromeDriverManager.getInstance().setup();
            driver = new BoshinyaChromeDriver(capabilities);
        }else{

        }
    }

    private DesiredCapabilities getChromeDesiredCapabilities() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

        HashMap<String, String> chromePreferences = new HashMap();
        chromePreferences.put("profile.password_manager_enabled", "false");
        chromePreferences.put("credentials_enable_service", "false");
        chromePreferences.put("download.default_directory", workingDir + "/downloads");
        options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePreferences);
        options.addArguments("--disable-web-security");
        options.addArguments("--test-type");

        capabilities.setCapability("chrome.switches", Collections.singletonList("--no-default-browser-check"));
        capabilities.setCapability("chrome.switches", Collections.singletonList("--disable-logging"));
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        capabilities.setCapability("chrome.verbose", false);
        capabilities.setJavascriptEnabled(true);
        capabilities.setCapability("nativeEvents", true);
        return capabilities;
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
