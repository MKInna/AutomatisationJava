import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;

import static org.testng.AssertJUnit.assertEquals;

/*1.Создайте проект с maven, загрузите Selenium, WebDrverManager, TestNG dependencyes,
в property укажите версии ваших зависимостей.
2. В папке тест, создайте main method, в нем инстанцируйте драйвер и зайдите на страницу
на весь экран https://ru.wikipedia.org/
3. Введите в поиск какое-либо слово или статью ( на ваш выбор, например Ubisoft),
далее в зависимости от ситуации, если у вас появилась статья, то  найдите название заголовка
и проверьте через assertEquals равно ли оно заранее записанному (как делали на уроке в конце),
 если же у вас появился список из статей то выберете первую и нажмите на нее, далее так
 же проверить название статьи.*/
public class Main {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        By search = By.xpath("//form/div/input");
        By result = By.xpath("//h1/span");
        driver1.get("https://ru.wikipedia.org/");
        driver1.manage().window().fullscreen();
        WebDriverWait wdw = new WebDriverWait(driver1, 15);
        clickElement(driver1, search);
        sendElement(driver1, search, "Ubisoft");
        clickEnter(driver1, search);
        String getTextFromElement;
        assertEquals("Ubisoft", getTextFromElement(driver1, result));

        driver1.quit();
    }

    static void sendElement(WebDriver driver, By locator, String text) {
        WebDriverWait wdw = new WebDriverWait(driver, 15);
        wdw.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }

    static void clickElement(WebDriver driver, By locator) {
        WebDriverWait wdw = new WebDriverWait(driver, 15);
        wdw.until(d -> d.findElement(locator)).click();
    }

    static void clickEnter(WebDriver driver, By locator) {
        WebDriverWait wdw = new WebDriverWait(driver, 15);
        wdw.until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(Keys.ENTER);
    }

    static String getTextFromElement(WebDriver driver, By locator) {
        WebDriverWait wdw = new WebDriverWait(driver, 15);
        return wdw.until(d -> d.findElement(locator).getText());
    }
}
