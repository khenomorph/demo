package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestInit {

    //public WebDriver driver;
    public ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    @AfterMethod
    public void Close(){
        getDriver().quit();
    }

    public void goToHS(){
        getDriver().get("https://en.wikipedia.org/wiki/Hot_spring");
    }

    public void goToTalk(){
        getDriver().get("https://en.wikipedia.org/wiki/Talk:Hot_spring");
    }
}
