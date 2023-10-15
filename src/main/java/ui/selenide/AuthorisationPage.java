package ui.selenide;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;


public class AuthorisationPage {
    private final SelenideElement login = $x("//div[@class='vector-menu-content']/ul/li[5]/a");
    private final SelenideElement enterUserName = $x("//input[@name='wpName']");
    private final SelenideElement enterPassword = $x("//input[@name='wpPassword']");
    private final SelenideElement pressEnter = $x("//button[@name='wploginattempt']");


    public AuthorisationPage login(){
        login.sendKeys(Keys.ENTER);
        return page(AuthorisationPage.class);
    }
    public AuthorisationPage fillLogin (String text) {
        enterUserName.shouldBe(visible).sendKeys(text);
        return page(AuthorisationPage.class);
    }
    public AuthorisationPage fillPassword (String text) {
        enterPassword.shouldBe(visible).sendKeys(text);
        return page(AuthorisationPage.class);
    }
    public AuthorisationPage enterAccount(){
        pressEnter.sendKeys(Keys.ENTER);
        return page(AuthorisationPage.class);
    }
    public SelenideElement getUserName(){
        return $x("//li[@class='mw-list-item']/a/span");
    }



}
