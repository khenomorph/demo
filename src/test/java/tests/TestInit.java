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

    public void goToHomePage(){
        getDriver().get("https://en.wikipedia.org/wiki/Main_Page");
    }
    public void goToTheAngelOfTheRevolution(){
        getDriver().get("https://en.wikipedia.org/wiki/The_Angel_of_the_Revolution");
    }

    public void goToMainPage(){
        getDriver().get("https://uk.wikipedia.org/wiki/%D0%93%D0%BE%D0%BB%D0%BE%D0%B2%D0%BD%D0%B0_%D1%81%D1%82%D0%BE%D1%80%D1%96%D0%BD%D0%BA%D0%B0");
    }

    public void goToWar(){
        getDriver().get("https://uk.wikipedia.org/wiki/%D0%92%D1%96%D0%B9%D0%BD%D0%B0_%D0%BC%D1%96%D0%B6_%D0%86%D0%B7%D1%80%D0%B0%D1%97%D0%BB%D0%B5%D0%BC_%D1%82%D0%B0_%D0%A5%D0%B0%D0%BC%D0%B0%D1%81%D0%BE%D0%BC");
    }
    public void goToLoginPage(){
        getDriver().get("https://uk.wikipedia.org/w/index.php?title=%D0%A1%D0%BF%D0%B5%D1%86%D1%96%D0%B0%D0%BB%D1%8C%D0%BD%D0%B0:%D0%92%D1%85%D1%96%D0%B4&returnto=%D0%92%D1%96%D0%B9%D0%BD%D0%B0+%D0%BC%D1%96%D0%B6+%D0%86%D0%B7%D1%80%D0%B0%D1%97%D0%BB%D0%B5%D0%BC+%D1%82%D0%B0+%D0%A5%D0%B0%D0%BC%D0%B0%D1%81%D0%BE%D0%BC");
    }
}
