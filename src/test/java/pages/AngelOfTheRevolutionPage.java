package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AngelOfTheRevolutionPage extends BasePage{
    public AngelOfTheRevolutionPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHardcover(){
        return driver.findElement(By.xpath("//a[@title=\"Hardcover\"]"));
    }
}
