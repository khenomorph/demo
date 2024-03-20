package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElectionsPage extends BasePage{
    public ElectionsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHardcover(){
        return driver.findElement(By.xpath("//a[@title=\"Hardcover\"]"));
    }
}
