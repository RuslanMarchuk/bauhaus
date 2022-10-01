package ui;

import Pages.HomePage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This test is checking the UI components on the header:
 * - Search field
 * - Logo
 * - Store selector
 * - User account button
 * - Mini cart button
 */
public class HeaderUiTest {

    public HomePage homePage = new HomePage();

    @BeforeClass
    private void start() {
        Selenide.open(homePage.getPageUlr());
        Configuration.holdBrowserOpen = true;
    }

    @Test
    @Description("* Verify that the search field is displayed on the header")
    public void searchFieldIsDisplayed() {
        Assert.assertTrue(homePage.getSEARCH_FIELD().isDisplayed());
    }

    @Test
    @Description("* Verify that the logo is displayed on the header")
    public void logoIsDisplayed(){
        Assert.assertTrue(homePage.getLOGO().isDisplayed());
    }

    @Test
    @Description("* Verify that the logo is displayed on the header")
    public void storeSelectorIsDisplayed(){
        Assert.assertTrue(homePage.getSTORE_SELECTOR().isDisplayed());
    }

    @Test
    @Description("* Verify that the user account button is displayed on the header")
    public void userAccountButtonIsDisplayed(){
        Assert.assertTrue(homePage.getUSER_ACCOUNT_BUTTON().isDisplayed());
    }

    @Test
    @Description("* Verify that the mini cart button is displayed on the header")
    public void miniCartButtonIsDisplayed(){
        Assert.assertTrue(homePage.getMINI_CART_BUTTON().isDisplayed());
    }
}
