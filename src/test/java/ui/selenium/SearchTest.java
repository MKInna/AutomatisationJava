package ui.selenium;

import org.testng.annotations.Test;
import ui.selenium.po.SearchPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.AssertJUnit.assertEquals;

public class SearchTest extends BaseTest {
    SearchPage search = new SearchPage();

    @Test
    void shouldBeVisibleByText() {
        driver.get("https://www.google.ru/?hl=ru");
        driver.manage().window().maximize();
        search.clickOnTabSearch();
        search.insertText("Ubisoft");
        search.clickTabEnter();
        assertThat(search.getTitle())
                .as("The result of test is appeared")
                .isEqualTo("Ubisoft");

    }


}
