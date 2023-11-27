package ui.selenium.builder;
import ui.selenium.po.GoogleSearchPage;

public class GoogleSearchBuilder {
    private String searchText;
    public GoogleSearchBuilder searchBuilder(String searchText){
        this.searchText = searchText;
        return this;
    }
    public GoogleSearchPage build(){
        return new GoogleSearchPage().fillInSearchField(searchText);
    }
}
