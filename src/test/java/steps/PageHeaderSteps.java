package steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import pages.PageHeader;

import java.time.Duration;

public class PageHeaderSteps {

    private PageHeader pageHeader = new PageHeader();

    @Step("Verify that the search field is displayed on the header")
    public void searchFieldIsDisplayed() {
        Assert.assertTrue(pageHeader.getSearchField().isDisplayed());
    }

    @Step("Verify that the logo is displayed on the header")
    public void logoIsDisplayed(){
        Assert.assertTrue(pageHeader.getLogo().isDisplayed());
    }

    @Step("Verify that the logo is displayed on the header")
    public void storeSelectorIsDisplayed(){
        Assert.assertTrue(pageHeader.getStoreSelector().isDisplayed());
    }

    @Step("Verify that the user account button is displayed on the header")
    public void userAccountButtonIsDisplayed() {
        Assert.assertTrue(pageHeader.getUserAccountButton().isDisplayed());
    }

    @Step("Verify that the mini cart button is displayed on the header")
    public void miniCartButtonIsDisplayed() {
        Assert.assertTrue(pageHeader.getMiniCartButton().isDisplayed());
    }
}
