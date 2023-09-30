package po;

import base.BaseMethods;
import org.openqa.selenium.By;

public class GoogleSearchPage extends BaseMethods {
    private final By fieldSearch = By.xpath("//textarea[@class='gLFyf']");
    private final By buttonSearch = By.xpath("//input[@class='gNO89b']");
    private final By linkFirstResultSearch = By.xpath("//h3[@class='LC20lb MBeuO DKV0Md'][1]");

    public GoogleSearchPage clickSearchField() {
        click(fieldSearch);
        return this;
    }
    public GoogleSearchPage fillInSearchField(String searchText) {
        send(fieldSearch, searchText);
        return this;
    }
    public GoogleSearchPage clickEnter(){
        clickEnter(buttonSearch);
        return this;
    }
    public GoogleSearchPage clickOnResult(){
        click(linkFirstResultSearch);
        return this;
    }


}
