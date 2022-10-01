package unit;

import Pages.BasicPage;
import Pages.HomePage;
import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class Logo {

    private final HomePage HOME_PAGE = new HomePage();
    private final SelenideElement LOGO_IMAGE = $(By.xpath("//*[@class='logo']/img"));

    @BeforeClass
    private void startTest() {
        Selenide.open(HOME_PAGE.getPageUlr());
        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void logoUrl(){
        Assert.assertEquals(LOGO_IMAGE.getAttribute("src"),
                "https://dev237-bauhausfi-m2-fi.vaimo.net/static/version1664542445/frontend/Vaimo/bauhausfi/fi_FI/images/logo.svg");
    }

    @Test
    public void validateLogoRedirection(){
        Assert.assertEquals(HOME_PAGE.getLOGO().getAttribute("href"), HOME_PAGE.getPageUlr());
        HOME_PAGE.getLOGO().click();
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(),
                "https://dev237-bauhausfi-m2-fi.vaimo.net/");
    }
}
