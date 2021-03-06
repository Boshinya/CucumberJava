package com.boshinya.pageobjects;

import com.boshinya.utilities.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by bothees on 11/10/2016.
 */
public class Homepage extends Common {

    private WebDriver driver;

    @FindBy(css = "ul#myProfileDetailsNav>li")
    private List<WebElement> history;

    public Homepage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public void clickonhistorybutton() {
        waitForVisibilityOfElements(history).get(0).click();
    }

    public boolean verifyhistory() {
        return true;
    }
}
