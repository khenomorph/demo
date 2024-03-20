package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement setName(){
        return driver.findElement(By.xpath("//*[@id=\"wpName1\"]"));
    }
    public WebElement setPsswrd(){
        return driver.findElement(By.xpath("//*[@id=\"wpPassword1\"]"));
    }
    public WebElement setRememberMe(){
        return driver.findElement(By.xpath("//*[@for=\"wpRemember\"]"));
    }
    public WebElement joinWiki(){
        return driver.findElement(By.xpath("//*[@id=\"mw-createaccount-join\"]"));
    }

}
