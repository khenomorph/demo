package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

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

    @Test
    public void GroundWaters(){
        goToTalk();
        WebDriver driver = getDriver();
        TalkPage talkPage = new TalkPage(driver);
        talkPage.getLogoGlobe().click();
        HomePage homePage = new HomePage(driver);
        Assert.assertFalse(homePage.getHeader().size() > 10);
    }

    @Test
    public void Article(){
        goToHomePage();
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.getLink().click();
        Assert.assertFalse(homePage.getTitle().size() > 500);
    }

    @Test
    public void Hardcover(){
        goToTheAngelOfTheRevolution();
        WebDriver driver = getDriver();
        AngelOfTheRevolutionPage angelOfTheRevolutionPage = new AngelOfTheRevolutionPage(driver);
        angelOfTheRevolutionPage.getHardcover().click();
        HardcoverPage hardcoverPage = new HardcoverPage(driver);
        hardcoverPage.getReferenceLinc().click();
        PublishingPerspectivePage publishingPerspectivePage = new PublishingPerspectivePage(driver);
        Assert.assertTrue(publishingPerspectivePage.checkLogo().isDisplayed());
    }

    @Test
    public void Ukrainian(){
        goToHomePage();
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.checkUkrainian().click();
        UkrainianWiki ukrainianWiki = new UkrainianWiki(driver);
        Assert.assertTrue(ukrainianWiki.checkParticipation().isDisplayed());
        Assert.assertTrue(ukrainianWiki.checkChapters().size() < 2);
    }

    @Test
    public void CurrentEvents(){
        goToMainPage();
        WebDriver driver = getDriver();
        UkrainianWiki ukrainianWiki = new UkrainianWiki(driver);
        ukrainianWiki.checkEvents().click();
        Assert.assertTrue(ukrainianWiki.checkEdit().isEnabled());
        Assert.assertTrue(ukrainianWiki.checkEdit().isDisplayed());
    }

    @Test
    public void Login(){
        goToWar();
        WebDriver driver = getDriver();
        UkrainianWiki ukrainianWiki = new UkrainianWiki(driver);
        ukrainianWiki.checkLogin().click();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.setName().sendKeys("123456");
        loginPage.setPsswrd().sendKeys("24680");
        Assert.assertFalse(loginPage.setRememberMe().isSelected());
    }

    @Test
    public void JoinWiki(){
        goToLoginPage();
        WebDriver driver = getDriver();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.joinWiki().click();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.setName2().sendKeys("User");
        signUpPage.setPsswrd2().sendKeys("1234567890");
        signUpPage.retypePsswrd().sendKeys("1234567890");
        signUpPage.setEmail().sendKeys("example@gmail.com");
        signUpPage.createAccount().click();
        Assert.assertFalse(signUpPage.setCaptcha().getText().contains("hjkkkk"));
    }
}
