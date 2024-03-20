package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PublishingPerspectivePage extends BasePage{
    public PublishingPerspectivePage(WebDriver driver) {
        super(driver);
    }
    public WebElement checkLogo(){
        return driver.findElement(By.xpath("//img[@alt=\"Publishing Perspectives\"]"));
    }
}
