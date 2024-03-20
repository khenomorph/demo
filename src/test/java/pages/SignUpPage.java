package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends BasePage{
    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    public WebElement setName2(){
        return driver.findElement(By.xpath("//*[@id=\"wpName2\"]"));
    }
    public WebElement setPsswrd2(){
        return driver.findElement(By.xpath("//*[@id=\"wpPassword2\"]"));
    }
    public WebElement retypePsswrd(){
        return driver.findElement(By.xpath("//*[@id=\"wpRetype\"]"));
    }
    public WebElement setEmail(){
        return driver.findElement(By.xpath("//*[@id=\"wpEmail\"]"));
    }
    public WebElement createAccount(){
        return driver.findElement(By.xpath("//*[@id=\"wpCreateaccount\"]"));
    }
    public WebElement setCaptcha(){
        return driver.findElement(By.xpath("//*[@id=\"mw-input-captchaWord\"]"));
    }
}
