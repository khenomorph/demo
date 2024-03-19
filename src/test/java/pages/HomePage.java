package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSrchFd() {
        return driver.findElement(By.xpath("//input[@class=\"cdx-text-input__input\"]"));
    }
}
