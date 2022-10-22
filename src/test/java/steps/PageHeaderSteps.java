package steps;

import io.qameta.allure.Step;
import org.testng.Assert;
import pages.PageHeader;

import java.time.Duration;

public class PageHeaderSteps {

    private PageHeader pageHeader = new PageHeader();

    @Step
    public void searchFieldIsDisplayed() {
        Assert.assertTrue(pageHeader.getSearchField().isDisplayed());
    }

    @Step
    public void logoIsDisplayed(){
        Assert.assertTrue(pageHeader.getLogo().isDisplayed());
    }

    @Step
    public void storeSelectorIsDisplayed(){
        Assert.assertTrue(pageHeader.getStoreSelector().isDisplayed());
    }

    @Step
    public void userAccountButtonIsDisplayed() {
        Assert.assertTrue(pageHeader.getUserAccountButton().isDisplayed());
    }

    @Step
    public void miniCartButtonIsDisplayed() {
        Assert.assertTrue(pageHeader.getMiniCartButton().isDisplayed());
    }
}
