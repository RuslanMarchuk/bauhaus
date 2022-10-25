package ui;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import steps.TopNavigationMenuSteps;

public class TopNavigationMenuTest {
    private TopNavigationMenuSteps topNavigationMenuSteps = new TopNavigationMenuSteps();
    private HomePage homePage = new HomePage();

    @BeforeClass
    private void start() {
        Selenide.open(homePage.getPageUlr());
        Configuration.holdBrowserOpen = true;
    }

    @Test
    private void openThirdCategoryPage(){
        topNavigationMenuSteps.openThirdLevelCategoryPage();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getTitle(), "Lattialaatat");
    }
}
