import builder.GoogleSearchBuilder;
import org.testng.annotations.Test;
import po.GoogleSearchPage;
import org.openqa.selenium.WebDriver;

public class GoogleSearchTest extends BaseTest {
    @Test
    void shouldBeVisibleBySearch() {

        new GoogleSearchPage().clickSearchField();
        GoogleSearchPage searchPage = new GoogleSearchBuilder()
                .searchBuilder("Java")
                .build()
                .clickEnter()
                .clickOnResult();
    }
}
