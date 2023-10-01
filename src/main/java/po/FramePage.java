package po;

import base.BaseMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramePage extends BaseMethods {
    private final By frameChild = By.xpath("//p");
    private final By parentFrame = By.xpath("//iframe[@id='frame1']");
    public String getText(){
        return getTextFromElement(frameChild);
    }



}
