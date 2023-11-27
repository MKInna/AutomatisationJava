package ui.selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ui.selenide.po.SearchPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Epic("[78]Page search")
public class SearchTest {

    @Test(groups = {"Smoke"})
    @Description("This test finds the article")
    @Story("[78-235] search article ")
    void shouldBeVisibleArticle(){
     open("https://ru.wikipedia.org/");
new SearchPage().fillSearch("Odesa")
        .clickEnter()
        .clickFirstArticle();
assertThat(new SearchPage().getHeaderArticle().shouldBe(visible).getText())
        .as("The header of Odessa article was not found ")
        .isEqualTo("Одесса");
    }

}
