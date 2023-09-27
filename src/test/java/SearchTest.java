import org.testng.annotations.Test;
import po.SearchPage;
import static org.testng.AssertJUnit.assertEquals;

/* 1. Воссоздайте у себя в проекте архитектуру которую описали на уроке и исправьте тест который
      у вас уже есть (при описании класса драйвера, добавьте 2 строчки в методе закрытия - driver.quit();
      driver = null; во избегания ошибки которую ловили на уроке)
      */


public class SearchTest extends BaseTest {
    SearchPage search = new SearchPage();
    @Test
    void shouldBeVisibleByText() {
        search.clickOnTabSearch();
        search.insertText("Ubisoft");
        search.clickTabEnter();
        assertEquals("Ubisoft", search.getTitle());
        search.clickOnTabSearch();
    }
}
