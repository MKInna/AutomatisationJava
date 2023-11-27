package ui.selenium;

import org.testng.annotations.Test;
import ui.selenium.po.TablePage;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ActionTableTest extends BaseTest {
    /*
    Сайт для тренировки https://demoqa.com/

    1. Реализуйте методы для работы с таблицами такую же как делали на уроке, для вот этой
   таблицы https://demoqa.com/webtables и получите какой-нибудь текст
    2. Реализуйте метод для загрузки файла на страницу по этой ссылке https://demoqa.com/upload-download
    3. Реализуйте тест в котором получите текст самого внутреннего фрейма по ссылке - https://demoqa.com/nestedframes
    Необязательная часть:

    Используя таблицу по ссылке  https://demoqa.com/webtables - реализуйте метод для работы с
    таблицей но усложненном формате, т.е. на уроке мы находили столбцы и строки по индексам,
     а сейчас вам нужно сделать так что бы искать по рядкам и названиям хедера.
     Например - getTextFromTable(2, "Age") -> вернет 45 из таблицы https://demoqa.com/webtables
*/

@Test
    public void getTextFromTable(){
    driver.get("https://demoqa.com/webtables");
    driver.manage().window().maximize();


    assertThat(new TablePage().getTextFromTable(2,4))
            .as("Text correct")
            .isEqualTo("alden@example.com");
    }

}
