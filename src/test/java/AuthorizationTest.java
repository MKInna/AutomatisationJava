import org.testng.annotations.Test;
import po.AuthorizationPage;
import static org.testng.Assert.assertEquals;

 /*  2. Создайте тест логин в систему. Заранее руками создайте себе юзера на википедии, далее создайте
        в page object страницу с локаторами и методами которые вам понадобятся в тесте ( например ввести имя,
        ввести пароль и т.д.)
     3. Проверкой в тесте будет найти и сверить никнейм вашего юзеру после входа в систему, он находится вверху страницы
        */

public class AuthorizationTest extends BaseTest{
    AuthorizationPage authorization = new AuthorizationPage();
    @Test
    void nicknameVerification() {
        authorization.clickOnTabLogin();
        authorization.setEnterUserName("Alice4488");
        authorization.setEnterPassword("zxcasdQWE");
        authorization.clickTab();
        assertEquals("Alice4488", authorization.getUserName());
    }
}
