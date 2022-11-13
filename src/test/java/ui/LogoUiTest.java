package ui;

import org.aeonbits.owner.ConfigFactory;
import pages.HomePage;
import pages.PageHeader;
import com.codeborne.selenide.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import properties.ProjectProperties;
import steps.LogoUiSteps;


public class LogoUiTest {

    private ProjectProperties projectProperties = ConfigFactory.create(ProjectProperties.class);

    private PageHeader pageHeader = new PageHeader();
    private HomePage homePage = new HomePage();
    private LogoUiSteps logoUiSteps = new LogoUiSteps();


    @BeforeClass
    private void startTest() {
        Selenide.open(homePage.getPageUlr());
        Configuration.holdBrowserOpen = true;
    }

    @Test
    public void logoIsVisible(){
        logoUiSteps.logoIsVisible();
    }

    @Test
    public void logoIsEnabled(){
        logoUiSteps.logoIsEnabled();
    }

    @Test
    public void checkLogoRedirection(){
        logoUiSteps.checkLogoRedirection();
    }
}
