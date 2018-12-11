package com.boshinya.utilities;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BoshinyaChromeDriver extends ChromeDriver {

    private final SizzleSelector sizzleSelector;

    public BoshinyaChromeDriver(Capabilities desiredCapabilities) {
        super(desiredCapabilities);
        sizzleSelector = new SizzleSelector(this);
    }

    @Override
    public WebElement findElementByCssSelector(String using) {
        return sizzleSelector.findElementBySizzleCss(using);
    }

    @Override
    public List<WebElement> findElementsByCssSelector(String using) {
        return sizzleSelector.findElementsBySizzleCss(using);
    }
}
