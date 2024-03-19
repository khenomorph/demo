package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getImg(){
        return driver.findElement(By.xpath("//img[@src=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/c5/Prokaryote_cell.svg/310px-Prokaryote_cell.svg.png\"]"));
    }
    public List<WebElement> getWrd(){
        return driver.findElements(By.xpath("//*[text()='procaryote']"));
    }

    public WebElement getHS(){
        return driver.findElement(By.xpath("//a[@href=\"/wiki/Hot_spring\"]"));
    }
}
