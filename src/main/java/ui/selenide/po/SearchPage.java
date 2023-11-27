package ui.selenide.po;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class SearchPage {
private final SelenideElement searchField = $x("//input[@class='vector-search-box-input']");
private final SelenideElement firstArticle = $x("//div[@class ='mw-search-result-heading']/a[@title='Одесса']");

public SelenideElement getHeaderArticle(){
    return $x("//span[@class ='mw-page-title-main']");
}
@Step("Filling out the search field")
public SearchPage fillSearch (String text){
    searchField.shouldBe(visible).sendKeys(text);
   return page(SearchPage.class);
}
@Step ("Click enter to search")
public SearchPage clickEnter(){
    searchField.sendKeys(Keys.ENTER);
    return page(SearchPage.class);
}
@Step ("Click first article")
public SearchPage clickFirstArticle(){
    firstArticle.shouldBe(visible).click();
    return page(SearchPage.class);
}


}
