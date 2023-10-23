package ui.selenide;

import org.testng.annotations.Test;
import ui.selenide.AuthorisationPage;


import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AuthorisationTest {

   @Test
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
