package pages;

import org.openqa.selenium.*;

import utilities.DriverSetup;

public class BasePage extends DriverSetup{

    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void clickOnAElement(By locator){
        getElement(locator).click();
    }

    public void writeOnByLocator(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator){
       return getElement(locator).getText();
    }

}
