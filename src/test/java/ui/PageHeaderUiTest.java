package ui;

import pages.HomePage;
import pages.PageHeader;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.PageHeaderSteps;

public class PageHeaderUiTest {

    private PageHeader pageHeader = new PageHeader();
    private HomePage homePage = new HomePage();
    private PageHeaderSteps pageHeaderSteps = new PageHeaderSteps();

    @BeforeClass
    private void start() {
        Selenide.open(homePage.getPageUlr());
        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void searchFieldIsDisplayed() {
        pageHeaderSteps.searchFieldIsDisplayed();
    }

    @Test
    public void logoIsDisplayed() {
        pageHeaderSteps.logoIsDisplayed();
    }

    @Test
    public void storeSelectorIsDisplayed() {
        pageHeaderSteps.storeSelectorIsDisplayed();
    }

    @Test
    public void userAccountButtonIsDisplayed() {
        pageHeaderSteps.userAccountButtonIsDisplayed();
    }

    @Test
    public void miniCartButtonIsDisplayed() {
        pageHeaderSteps.miniCartButtonIsDisplayed();
    }
}
