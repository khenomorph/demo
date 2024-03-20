package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;

public class TalkPage extends BasePage {
    public TalkPage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getBbl(){
        return driver.findElements(By.xpath("//span[@class=\"wpb-header-bubbles\"]"));
    }
    public WebElement getJpg(){
        return driver.findElement(By.xpath("//img[@src=\"//upload.wikimedia.org/wikipedia/commons/thumb/d/dc/MSH82_st_helens_plume_from_harrys_ridge_05-19-82.jpg/35px-MSH82_st_helens_plume_from_harrys_ridge_05-19-82.jpg\"]"));
    }
    public WebElement getLogoGlobe(){
        return driver.findElement(By.xpath("//img[@class=\"mw-logo-icon\"]"));
    }
}
