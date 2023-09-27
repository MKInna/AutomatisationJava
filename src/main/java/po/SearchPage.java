package po;

import base.BaseMethods;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethods {
    private final By search = By.xpath("//form/div/input");
    private final By result = By.xpath("//h1/span");

    public void clickOnTabSearch(){
        click(search);
    }
    public void insertText(String text){
        send(search,text);
    }
    public void clickTabEnter(){
        clickEnter(search);
    }
    public String getTitle(){
      return getTextFromElement(result);
    }

}
