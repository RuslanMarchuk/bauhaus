package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TopNavigationMenu;
import steps.TopNavigationMenuSteps;

public class TopNavigationMenuTest {
    private TopNavigationMenuSteps topNavigationMenuSteps = new TopNavigationMenuSteps();
    private TopNavigationMenu topNavigationMenu = new TopNavigationMenu();
    private HomePage homePage = new HomePage();
    private WebDriver driver;
    private JavascriptExecutor jsExecutor;
    @BeforeClass
    private void start() {
        Selenide.open(homePage.getPageUlr());
        Configuration.holdBrowserOpen = true;
        driver = WebDriverRunner.getWebDriver();
        jsExecutor = (JavascriptExecutor) driver;

    }

    @Test
    private void navigateMegaMenuCategories() {
        topNavigationMenuSteps.clickMegaMenuButton();
        Assert.assertTrue(topNavigationMenu.getMegaMenuBlock().isDisplayed());
        topNavigationMenuSteps.hoverFirstLevelCategoryItem();
        Assert.assertTrue(topNavigationMenu.getFirstCategoryLevelBlock().isDisplayed());
        topNavigationMenuSteps.hoverSecondLevelCategoryItem();
        Assert.assertEquals(topNavigationMenu.getSecondCategoryLevelBlockTitle().getText(), "Laatat");
        topNavigationMenuSteps.clickMegaMenuButton();
    }

    @Test
    private void openThirdLevelCategoryPage() {
        topNavigationMenuSteps.openThirdLevelCategoryPage();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getTitle(), "Lattialaatat");
        Selenide.open(homePage.getPageUlr());

    }

    @Test
    private void stickyMegaMenu() {
        topNavigationMenuSteps.clickMegaMenuButton();
        jsExecutor.executeScript("window.scrollBy(0,500)");

    }
}
