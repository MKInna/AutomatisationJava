package selenide;

import org.testng.annotations.Test;
import selenide.po.SearchPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchTest {

    @Test
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
