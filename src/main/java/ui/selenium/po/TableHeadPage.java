package ui.selenium.po;

import ui.selenium.base.BaseMethods;
import ui.selenium.base.TableHead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHeadPage extends BaseMethods {
    private final By table = By.xpath("//div[@class='rt-table']");

    public String getTextFromTable(int row, String  col) {
        WebElement tableMp = getWait().until(d -> d.findElement(table));
        TableHead table = new TableHead(tableMp);
        return table.getValue(row, col);
    }

}
