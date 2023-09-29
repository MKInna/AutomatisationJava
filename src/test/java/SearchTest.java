import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import po.SearchPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.AssertJUnit.assertEquals;

/*Во всех заданиях использовать AssertJ
     1. Напишите файл testng.xml как делали на уроке и попробуйте по запускать тесты с командной строки mvn clean test
        Напишите тест валидации логина и пароль. Должно быть 2 теста, в первый передавайте валидный логин и
        через dataProvider не валидные пароли, спец символы, пустые строки и т.д. - все что вызовет ошибку,
        во втором тесте у вас должен передаваться правильный пароль, но так же через дата провайдер не валидные логины,
        тесты должны проверять что отображается уведомление об ошибке о не валидности данных
     2. Пометьте атрибутами-группам свои тесты, например: пометьте группой smoke тест о успешной авторизации и
        группой regression ваши тесты валидации сделанные выше, и попробуйте запускать это командой - mvn clean test
        -Dgroups=название группы, Не забудьте поставить группы в базовые тесты запуска и так же в файл testmg.xml

        Необязательное задание:

        Перейдите в google.com, суть что бы вы создали билдер поиска, он должен быть аналогичный тому что показывал
        на уроке, он должен хранить какое-то значение которое вы будете применять для поиска и далее просто клик на поиск,
        ну и результатом теста будет первая ссылка (значение поиска любое, ищите то что больше понравится)*/

public class SearchTest extends BaseTest {
    SearchPage search = new SearchPage();

    @Test
    void shouldBeVisibleByText() {
        search.clickOnTabSearch();
        search.insertText("Ubisoft");
        search.clickTabEnter();
        assertThat(search.getTitle())
                .as("The result of test is appeared")
                .isEqualTo("Ubisoft");

    }


}
