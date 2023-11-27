package ui.selenium;

import ui.selenium.builder.LoginPageBuilder;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.selenium.po.AuthorizationPage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthorisationTest extends BaseTest {

    @Test(groups = {"Smoke"})
    void authorizationSuccessful() {
        driver.get("https://ru.wikipedia.org/");
        driver.manage().window().maximize();
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

    @Test(groups = {"Regression"},dataProvider = "IsPasswordValid")
    void passwordCheck(String date) {
        driver.get("https://ru.wikipedia.org/");
        driver.manage().window().maximize();
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
        driver.get("https://ru.wikipedia.org/");
        driver.manage().window().maximize();
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
    }
}




