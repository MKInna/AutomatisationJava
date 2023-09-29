import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import static config.WebDriverInit.closeDriver;
import static config.WebDriverInit.getDriver;
public class BaseTest {
    WebDriver driver = null;


    @BeforeMethod
    public void setUp() {
        WebDriver driver = null;
        driver = getDriver();
        // driver.get("https://ru.wikipedia.org/");
        driver.get("https://www.google.com/?hl=ru");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown () {
        closeDriver();
        driver = null;
    }
}