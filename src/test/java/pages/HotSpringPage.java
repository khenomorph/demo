package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HotSpringPage extends BasePage {
    public HotSpringPage(WebDriver driver) {
        super(driver);
    }

    public WebElement get2Img(){
        return driver.findElement(By.xpath("//img[@src=\"//upload.wikimedia.org/wikipedia/commons/thumb/9/9c/Aerial_view_of_Grand_Prismatic_%2823428929375%29.jpg/240px-Aerial_view_of_Grand_Prismatic_%2823428929375%29.jpg\"]"));
    }
    public WebElement getTalk(){
        return driver.findElement(By.xpath("//span[text()=\"Talk\"]"));
    }
}
