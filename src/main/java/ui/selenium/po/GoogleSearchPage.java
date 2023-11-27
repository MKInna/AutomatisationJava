package ui.selenium.po;

import ui.selenium.base.BaseMethods;
import org.openqa.selenium.By;

public class GoogleSearchPage extends BaseMethods {
    private final By fieldSearch = By.xpath("//textarea");
    private final By buttonSearch = By.xpath("//input[@class='RNmpXc']");
    private final By linkFirstResultSearch = By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']");

    public GoogleSearchPage clickSearchField() {
        click(fieldSearch);
        return this;
    }
    public GoogleSearchPage fillInSearchField(String searchText) {
        send(fieldSearch, searchText);
        return this;
    }
   /* public GoogleSearchPage clickEnter(){
        clickEnter(buttonSearch);;
        return this;
    }*/
    public GoogleSearchPage click(){
        clickEnter(fieldSearch);
        return this;
    }
    public GoogleSearchPage clickOnResult(){
        click(linkFirstResultSearch);
        return this;
    }
}
