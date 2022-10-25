package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.HomePage;
import pages.PageHeader;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;

public class LogoUiSteps {

    private PageHeader pageHeader = new PageHeader();
    private HomePage homePage = new HomePage();

    @Step("Page logo should be visible")
    public void logoIsVisible(){
        pageHeader.getLogo().shouldBe(visible, Duration.ofSeconds(5));
    }

    @Step("Page logo should be clickable")
    public void logoIsEnabled(){
        pageHeader.getLogo().shouldBe(enabled, Duration.ofSeconds(5));
    }

    @Step("Verify that the logo redirects to the homepage after clicking")
    public void checkLogoRedirection(){
        pageHeader.getLogo().click();
        pageHeader.getLogo().shouldBe(visible);
        Assert.assertEquals(WebDriverRunner.getWebDriver().getCurrentUrl(), homePage.getPageUlr());
    }
}
