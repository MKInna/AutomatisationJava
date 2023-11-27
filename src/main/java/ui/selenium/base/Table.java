package ui.selenium.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;


public class Table extends BaseMethods {
    WebElement elementTable;
   public Table(WebElement elementTable){
        this.elementTable = elementTable;
    }

    private List<WebElement> getRows() {
        List<WebElement> rows = elementTable.findElements(By.xpath(".//div[@class='rt-tr-group']"));

        return rows;
    }
    private List<List<WebElement>> getRowsAndColumns(){
       List<WebElement> rows = getRows();
       List<List<WebElement>> rowsAndColumns = new ArrayList<>();
       for (WebElement row:rows){
           List<WebElement> columns = row.findElements(By.xpath(".//div[@class = 'rt-td']"));
           rowsAndColumns.add(columns);
        }
       return rowsAndColumns;
    }
    public String getValue(int row, int column){
        List<List<WebElement>> rowsAndColumns = getRowsAndColumns();
        WebElement cell = rowsAndColumns.get(row).get(column);
        return cell.getText();
    }

}
