package tests;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HotSpringPage;
import pages.SearchPage;
import pages.TalkPage;

public class TestWikiHome extends TestInit {

    @Test
    public void WikiTest(){
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.getSrchFd().sendKeys("procaryote\n");
        SearchPage searchPage = new SearchPage(driver);
        Assert.assertTrue(searchPage.getImg().isDisplayed());
        Assert.assertFalse(searchPage.getWrd().size() > 3);
        Assert.assertTrue(searchPage.getHS().isDisplayed());
        searchPage.getHS().click();
    }
   @Test
    public void HotSpring(){
        goToHS();
        WebDriver driver = getDriver();
        HotSpringPage hotSpringPage = new HotSpringPage(driver);
        Assert.assertTrue(hotSpringPage.get2Img().isDisplayed());
        Assert.assertTrue(hotSpringPage.getTalk().isEnabled());
    }

    @Test
    public void Talk(){
        goToTalk();
        WebDriver driver = getDriver();
        TalkPage talkPage = new TalkPage(driver);
        Assert.assertFalse(talkPage.getBbl().contains("middle"));
        Assert.assertTrue(talkPage.getBbl().size()>2);
        Assert.assertTrue(talkPage.getJpg().isDisplayed());
    }
}
