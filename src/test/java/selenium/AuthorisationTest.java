package selenium;

import selenium.builder.LoginPageBuilder;
import org.testng.annotations.Test;
import selenium.po.AuthorizationPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
 /*
Во всех заданиях использовать AssertJ
 1. Напишите файл testng.xml как делали на уроке и попробуйте по запускать тесты с командной строки mvn clean test
 2. Напишите тест валидации логина и пароль. Должно быть 2 теста, в первый передавайте валидный логин и через
    dataProvider не валидные пароли, спец символы, пустые строки и т.д. - все что вызовет ошибку, во втором
    тесте у вас должен передаваться правильный пароль, но так же через дата провайдер не валидные логины,
    тесты должны проверять что отображается уведомление об ошибке о не валидности данных
 3. Пометьте атрибутами-группам свои тесты, например: пометьте группой smoke тест о успешной авторизации и
    группой regression ваши тесты валидации сделанные выше, и попробуйте запускать это командой
    - mvn clean test -Dgroups=название группы, Не забудьте поставить группы в базовые тесты запуска и так же
    в файл testmg.xml
Необязательное задание:

 Перейдите в google.com, суть что бы вы создали билдер поиска, он должен быть аналогичный тому что
 показывал на уроке, он должен хранить какое-то значение которое вы будете применять для поиска и далее
 просто клик на поиск, ну и результатом теста будет первая ссылка (значение поиска любое, ищите то что
 больше понравится)
  */

public class AuthorisationTest extends BaseTest {

    @Test(groups = {"Smoke"})
    void authorizationSuccessful() {
        new AuthorizationPage()
                .clickOnLinkEnter();
        AuthorizationPage login = new LoginPageBuilder()
                .withUserName("Alice4488")
                .withPassword("zxcasdQWE")
                .build();
        login.clickEnter();


        assertThat(login.getUserNameLink())
                .as("Authorization successful")
                .isEqualTo("Alice4488");
    }

    /*@Test(groups = {"Regression"},dataProvider = "IsPasswordValid")
    void passwordCheck(String date) {
        new AuthorizationPage()
                .clickOnLinkEnter();
        AuthorizationPage login1 = new LoginPageBuilder()
                .withUserName("Alice4488")
                .withPassword(date)
                .build();

        login1.clickEnter();
        assertThat(login1.getLoginPageErrorMessage())
                .as("Wrong password")
                .isEqualTo("Введены неверные имя участника или пароль. Попробуйте ещё раз.");

    }

    @Test(groups = {"Regression"},dataProvider = "IsLoginValid")
    void loginCheck(String date) {
        new AuthorizationPage()
                .clickOnLinkEnter();
        AuthorizationPage login2 = new LoginPageBuilder()
                .withUserName(date)
                .withPassword("zxcasdQWE")
                .build();

        login2.clickEnter();
        assertThat(login2.getLoginPageErrorMessage())
                .as("Wrong login")
                .isEqualTo("Введены неверные имя участника или пароль. Попробуйте ещё раз.");


    }

    @DataProvider(name = "IsPasswordValid")
    public Object[][] setPassword() {
        Object[][] setPassword = new Object[][]{
                {"Aq@5% "},
                {"FGH4$5"},
                {"!kjtT#"}
        };
        return setPassword;
    }

    @DataProvider(name = "IsLoginValid")
    public Object[][] setLogin() {
        Object[][] setLogin = new Object[][]{
                {"1232!W3532"},
                {"Rgfd@765"},
                {"!#yQWen"}
        };
        return setLogin;
    }*/
}




