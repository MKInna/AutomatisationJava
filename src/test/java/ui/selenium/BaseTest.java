package ui.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static ui.selenium.config.WebDriverInit.closeDriver;
import static ui.selenium.config.WebDriverInit.getDriver;
public class BaseTest {
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() {

        driver = getDriver();
    }
    @AfterMethod
    public void tearDown () {
        closeDriver();
        driver = null;
    }
}