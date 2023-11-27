package ui.selenium.po;

import ui.selenium.base.BaseMethods;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethods {
    private final By search = By.xpath("//textarea");
    private final By result = By.xpath("//span[@class='VuuXrf']");

    public SearchPage clickOnTabSearch(){
        click(search);
        return this;
    }
    public SearchPage insertText(String text){
        send(search,text);
        return this;
    }
    public SearchPage clickTabEnter(){
        clickEnter(search);
        return this;
    }
    public String getTitle(){
      return getTextFromElement(result);
    }

}
