package ui.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import ui.selenium.po.FramePage;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GetTextFromFrameTest extends BaseTest {
    @Test
    public void textFromFrame() {
        driver.get("https://demoqa.com/nestedframes");
        driver.manage().window().maximize();
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame);
        WebElement frame1 = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame1);

        assertThat(new FramePage().getText())
                .as("text frame")
                .isEqualTo("Child Iframe");

    }
}
