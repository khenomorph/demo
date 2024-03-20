package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HardcoverPage extends BasePage{
    public HardcoverPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getReferenceLinc(){
        return driver.findElement(By.xpath("//a[@href=\"http://publishingperspectives.com/2009/06/in-praise-of-paper-over-board/\"]"));
    }
}
