package ui;

import pages.PageHeader;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import steps.PageHeaderSteps;

public class PageHeaderUiTest {

    public PageHeader pageHeader = new PageHeader();
    public PageHeaderSteps pageHeaderSteps = new PageHeaderSteps();

    @BeforeClass
    private void start() {
        Selenide.open(pageHeader.getPageUlr());
        Configuration.holdBrowserOpen = true;
    }

    @Test
    @Description("* Verify that the search field is displayed on the header")
    public void searchFieldIsDisplayed() {
        pageHeaderSteps.searchFieldIsDisplayed();
    }

    @Test
    @Description("* Verify that the logo is displayed on the header")
    public void logoIsDisplayed() {
        pageHeaderSteps.logoIsDisplayed();
    }

    @Test
    @Description("* Verify that the logo is displayed on the header")
    public void storeSelectorIsDisplayed() {
        pageHeaderSteps.storeSelectorIsDisplayed();
    }

    @Test
    @Description("* Verify that the user account button is displayed on the header")
    public void userAccountButtonIsDisplayed() {
        pageHeaderSteps.userAccountButtonIsDisplayed();
    }

    @Test
    @Description("* Verify that the mini cart button is displayed on the header")
    public void miniCartButtonIsDisplayed() {
        pageHeaderSteps.miniCartButtonIsDisplayed();
    }
}
