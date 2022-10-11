package ui;

import pages.PageHeader;
import com.codeborne.selenide.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogoUiTest {

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
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://dev237-bauhausfi-m2-fi.vaimo.net/");
    }
}
