package steps;

import io.qameta.allure.Step;
import pages.TopNavigationMenu;

public class TopNavigationMenuSteps {

    private TopNavigationMenu topNavigationMenu = new TopNavigationMenu();

    @Step("Verify that the correct page is opened after clicking the second level category name in megamenu")
    public void clickThirdLevelCategoryItem(){
        topNavigationMenu.getMegaMenuCategoryElement("Lattialaatat").click();
    }
    @Step("Verify that the megamenu block is opened after clicking the megamenu button")
    public void clickMegaMenuButton(){
        topNavigationMenu.getMegaMenu().click();
    }
    @Step("Verify that the first category level block is opened after clicking the first level category")
    public void hoverFirstLevelCategoryItem(){
        topNavigationMenu.getMegaMenuCategoryElement("Rakentaminen ja Remontointi").hover();
    }
    @Step("Verify that the second category level block is opened after clicking the first level category")
    public void hoverSecondLevelCategoryItem(){
        topNavigationMenu.getMegaMenuCategoryElement("Laatat").hover();
    }
    @Step("Verify that the second category level block is opened after clicking the first level category")
    public void openThirdLevelCategoryPage(){
        clickMegaMenuButton();
        hoverFirstLevelCategoryItem();
        hoverSecondLevelCategoryItem();
        clickThirdLevelCategoryItem();
    }


}
