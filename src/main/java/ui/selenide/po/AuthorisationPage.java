package ui.selenide.po;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;


public class AuthorisationPage {
    private final SelenideElement login = $x("//div[@class='vector-menu-content']/ul/li[5]/a");
    private final SelenideElement enterUserName = $x("//input[@name='wpName']");
    private final SelenideElement enterPassword = $x("//input[@name='wpPassword']");
    private final SelenideElement pressEnter = $x("//button[@name='wploginattempt']");

    @Step ("Click on the login field")
    public AuthorisationPage login(){
        login.sendKeys(Keys.ENTER);
        return page(AuthorisationPage.class);
    }
    @Step ("Fill login")
    public AuthorisationPage fillLogin (String text) {
        enterUserName.shouldBe(visible).sendKeys(text);
        return page(AuthorisationPage.class);
    }
    @Step ("Fill password ")
    public AuthorisationPage fillPassword (String text) {
        enterPassword.shouldBe(visible).sendKeys(text);
        return page(AuthorisationPage.class);
    }
    @Step ("Click enter to log in ")
    public AuthorisationPage enterAccount(){
        pressEnter.sendKeys(Keys.ENTER);
        return page(AuthorisationPage.class);
    }
    @Step ("Get user name")
    public SelenideElement getUserName(){
        return $x("//li[@class='mw-list-item']/a/span");
    }



}
