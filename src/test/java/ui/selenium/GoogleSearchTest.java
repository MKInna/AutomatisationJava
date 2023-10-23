package ui.selenium;

import ui.selenium.builder.GoogleSearchBuilder;
import org.testng.annotations.Test;
import ui.selenium.po.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest {
    @Test
    void shouldBeVisibleBySearch() {
        driver.get("https://www.google.com/?hl=ru");
        driver.manage().window().maximize();
        new GoogleSearchPage().clickSearchField();
        GoogleSearchPage searchPage = new GoogleSearchBuilder()
                .searchBuilder("Java")
                .build()
                .click()
                .clickOnResult();
    }
}
