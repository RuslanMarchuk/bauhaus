package ui;

import org.aeonbits.owner.ConfigFactory;
import pages.PageHeader;
import com.codeborne.selenide.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import properties.ProjectProperties;


public class LogoUiTest {

    private ProjectProperties projectProperties = ConfigFactory.create(ProjectProperties.class);

    private PageHeader pageHeader = new PageHeader();


    @BeforeClass
    private void startTest() {
        Selenide.open(pageHeader.getPageUlr());
        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void validateLogoRedirection(){
        Assert.assertEquals(pageHeader.getLogo().getAttribute("href"), pageHeader.getPageUlr());
        pageHeader.getLogo().click();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),projectProperties.getHomepageUrl());
    }
}
