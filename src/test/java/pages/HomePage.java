package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSrchFd() {
        return driver.findElement(By.xpath("//input[@class=\"cdx-text-input__input\"]"));
    }

    public List<WebElement> getHeader(){
        return driver.findElements(By.xpath("//*[@class=\"mw-headline\"]"));
    }

    public WebElement getLink(){
        return driver.findElement(By.xpath("//*[@id=\"In_the_news\"]"));
    }

    public WebElement checkUkrainian(){
        return driver.findElement(By.xpath("//span[@title=\"Ukrainian (uk:)\"]"));
    }
    public List<WebElement> getTitle(){
        return driver.findElements(By.xpath("//*[@title]"));
    }
}

