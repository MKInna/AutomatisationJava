package ui.selenium.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableHead extends BaseMethods{
    WebElement elementTable;
    public TableHead(WebElement elementTable){
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
            List<WebElement> columns = row.findElements(By.xpath(".//div[@class='rt-td']"));
            rowsAndColumns.add(columns);
        }
        return rowsAndColumns;
    }
    public String getValue(int row, String column){
        List<Map<String, WebElement>> rows = getRowsAndColumnsByHeading();
        WebElement cell = rows.get(row-1).get(column);
        return cell.getText();
    }
    public String getKeyString(int row, String column){
        String t;
        List<Map<String, WebElement>> rows = getRowsAndColumnsByHeading();
        WebElement cell = rows.get(row-2).get(column);

        return t = cell.toString() ;
    }
    private List<WebElement> getHead() {
        WebElement head = elementTable.findElement(By.xpath("//div[@class='rt-tr']"));
        return head.findElements(By.xpath(".//div[@class='rt-resizable-header-content']"));
    }
    public List<Map<String, WebElement>> getRowsAndColumnsByHeading(){
        List<List<WebElement>> rowsWithColumns = getRowsAndColumns();
        List<Map<String, WebElement>> rowsAndColumnsByHeading = new ArrayList<>();
        Map<String, WebElement> rowByHeading;
        List<WebElement> headingColumns = getHead();
        for (List<WebElement> row : rowsWithColumns){
            rowByHeading = new HashMap<>();
            for (int i=0; i< headingColumns.size() - 1; i++){
                String head = headingColumns.get(i).getText();
                WebElement cell = row.get(i);
                rowByHeading.put(head, cell);
            }
            rowsAndColumnsByHeading.add(rowByHeading);
        }
        return rowsAndColumnsByHeading;

    }
}
