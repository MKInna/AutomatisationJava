package selenium.po;

import selenium.base.BaseMethods;
import selenium.base.Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TablePage extends BaseMethods {

    private final By table = By.xpath("//div[@class='rt-table']");

    public String getTextFromTable(int row, int  col){
        WebElement tableMp = getWait().until(d->d.findElement(table));
        Table table1 = new Table(tableMp);
        return table1.getValue(row, col);
    }


}
