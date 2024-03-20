package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UkrainianWiki extends BasePage{
    public UkrainianWiki(WebDriver driver) {
        super(driver);
    }
    public WebElement checkParticipation(){
        return driver.findElement(By.xpath("//*[text()='Портал спільноти']"));
    }
    public List<WebElement> checkChapters(){
        return driver.findElements(By.xpath("//span[@id=\"Розділи\"]"));
    }

    public WebElement checkEvents(){
        return driver.findElement(By.xpath("//*[@title=\"Війна між Ізраїлем та Хамасом\"]"));
    }
    public WebElement checkEdit(){
        return driver.findElement(By.xpath("//*[text()='Редагувати']"));
    }

    public WebElement checkLogin(){
        return driver.findElement(By.xpath("//a[@title=\"Заохочуємо Вас увійти в систему, але це необов'язково. [alt-shift-o]\"]/span"));
    }
}
