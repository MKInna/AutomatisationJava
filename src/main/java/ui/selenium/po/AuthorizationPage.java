package ui.selenium.po;

import ui.selenium.base.BaseMethods;
import org.openqa.selenium.By;

public class AuthorizationPage extends BaseMethods {
    private final By login = By.xpath("//div[@class='vector-menu-content']/ul/li[5]/a/span");
    private final By enterUserName = By.xpath("//form[@class='mw-htmlform mw-htmlform-codex']/div/div/div/div/input");
    private final By enterPassword = By.xpath("//form[@class='mw-htmlform mw-htmlform-codex']/div/div[2]/div/div/input");
    private final By pressEnter = By.xpath("//form[@class='mw-htmlform mw-htmlform-codex']/div/div[4]/div/button");
    private final By getUserNameLink = By.xpath("//li[@class='mw-list-item']/a/span");

    private final By loginPageErrorMessage = By.xpath("//div[@class = 'cdx-message__content']");

    public AuthorizationPage clickOnLinkEnter() {
        click(login);
        return this;
    }

    public AuthorizationPage setEnterUserName(String text) {
        send(enterUserName, text);
        return this;
    }

    public AuthorizationPage setEnterPassword(String text) {
        send(enterPassword, text);
        return this;
    }

    public AuthorizationPage clickEnter() {
        clickEnter(pressEnter);
        return this;
    }

    public String getUserNameLink() {
        return getTextFromElement(getUserNameLink);
    }

    public String getLoginPageErrorMessage() {
        return getTextFromElement(loginPageErrorMessage);
    }



}

