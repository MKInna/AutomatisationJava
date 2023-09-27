package po;

import base.BaseMethods;
import org.openqa.selenium.By;

public class AuthorizationPage extends BaseMethods {
    private final By login = By.xpath("//div[@class='vector-menu-content']/ul/li[5]/a/span");
    private final By enterUserName = By.xpath("//form[@class='mw-htmlform mw-htmlform-codex']/div/div/div/div/input");
    private final By enterPassword = By.xpath("//form[@class='mw-htmlform mw-htmlform-codex']/div/div[2]/div/div/input");
    private final By pressEnter = By.xpath("//form[@class='mw-htmlform mw-htmlform-codex']/div/div[4]/div/button");
    private final By getUserName = By.xpath("//li[@class='mw-list-item']/a/span");
    public void clickOnTabLogin(){ click(login);}
    public void setEnterUserName(String text){
        send(enterUserName,text);
    }
    public void setEnterPassword(String text){
        send(enterPassword,text);
    }
    public void clickTab(){
        clickEnter(pressEnter);
    }

    public String getUserName(){ return getTextFromElement(getUserName);}
}
