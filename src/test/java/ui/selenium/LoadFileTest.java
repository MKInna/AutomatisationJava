package ui.selenium;

import org.testng.annotations.Test;
import ui.selenium.po.LoadFilePage;

public class LoadFileTest extends BaseTest {
    @Test
    public void loadFile(){
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        new LoadFilePage().load("C:\\Users\\user\\IdeaProjects\\Automatisation\\Automatisation\\Automatisation\\text.txt");

    }
}
