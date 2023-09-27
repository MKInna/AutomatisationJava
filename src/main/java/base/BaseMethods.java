package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static config.WebDriverInit.getDriver;

public class BaseMethods {
    public WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), 15);
    }
    protected void send(By locator, String text) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }
    protected void click(By locator) {
        getWait().until(d -> d.findElement(locator)).click();
    }
    protected void clickEnter(By locator) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(Keys.ENTER);
    }
    protected String getTextFromElement(By locator) {
        return getWait().until(d -> d.findElement(locator).getText());
    }
    public WebDriverWait getWait(int time) {
        return new WebDriverWait(getDriver(), time);
    }
    protected void send(By locator, String text, int time) {
        getWait(time).until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }
    protected void click(By locator, int time) {
        getWait(time).until(d -> d.findElement(locator)).click();
    }
    protected void clickEnter(By locator, int time) {
        getWait(time).until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(Keys.ENTER);
    }
    protected String getTextFromElement(By locator, int time) {
        return getWait(time).until(d -> d.findElement(locator).getText());
    }

}
