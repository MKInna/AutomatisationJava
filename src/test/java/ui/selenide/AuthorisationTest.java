package ui.selenide;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ui.selenide.po.AuthorisationPage;


import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@Epic("[66] Authorisation ")
public class AuthorisationTest {

   @Test(groups = {"Smoke"})
   @Description("This test auth in the system as user")
   @Story("[66-235] Auth ")
   void checkAuthorisation(){
       open("https://ru.wikipedia.org/");
       new AuthorisationPage()
               .login()
               .fillLogin("Alice4488")
               .fillPassword("zxcasdQWE")
               .enterAccount();

       assertThat(new AuthorisationPage().getUserName().getText())
               .as("Check authorisation")
               .isEqualTo("Alice4488");

}

}
