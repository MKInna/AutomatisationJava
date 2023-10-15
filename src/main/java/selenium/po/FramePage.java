package selenium.po;

import selenium.base.BaseMethods;
import org.openqa.selenium.By;

public class FramePage extends BaseMethods {
    private final By frameChild = By.xpath("//p");
    private final By parentFrame = By.xpath("//iframe[@id='frame1']");
    public String getText(){
        return getTextFromElement(frameChild);
    }



}
