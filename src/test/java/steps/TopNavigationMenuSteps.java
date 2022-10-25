package steps;

import io.qameta.allure.Step;
import pages.TopNavigationMenu;

public class TopNavigationMenuSteps {

    private TopNavigationMenu topNavigationMenu = new TopNavigationMenu();

    @Step("Verify that the correct page is opened after clicking the 3rd level category in megamenu")
    public void openThirdLevelCategoryPage(){
        topNavigationMenu.getMegaMenu().click();
        topNavigationMenu.getMegaMenuCategoryElement("Rakentaminen ja Remontointi").hover();
        topNavigationMenu.getMegaMenuCategoryElement("Laatat").hover();
        topNavigationMenu.getMegaMenuCategoryElement("Lattialaatat").click();
    }
}
