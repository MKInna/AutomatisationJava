import org.testng.annotations.Test;
import po.LoadFilePage;

public class LoadFileTest extends BaseTest {
    @Test
    public void loadFile(){
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();
        new LoadFilePage().load("C:\\Users\\Admin\\IdeaProjects\\Automatisation\\text.txt");

    }
}
