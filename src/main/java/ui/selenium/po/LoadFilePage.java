package ui.selenium.po;

import ui.selenium.base.BaseMethods;
import org.openqa.selenium.By;

public class LoadFilePage extends BaseMethods {
    private final By loadButton = By.xpath("//input[@class='form-control-file']");
    public LoadFilePage load(String path){
        send(loadButton, path);
        return this;
    }
}
