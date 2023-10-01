import org.testng.annotations.Test;
import po.TableHeadPage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SearchByTableHeadTest extends BaseTest {
    @Test
    public void getTextFromTable(){
        driver.get("https://demoqa.com/webtables");
        driver.manage().window().maximize();

        assertThat(new TableHeadPage().getTextFromTable(2,"Age"))
                .as("Text correct")
                .isEqualTo("45");
    }
}
