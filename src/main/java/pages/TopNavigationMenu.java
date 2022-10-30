package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

@Getter
public class TopNavigationMenu {

    private SelenideElement megaMenu = $(By.xpath("//li[contains(@class, ' v-navigation__item--main')][1]"));

    public SelenideElement getMegaMenuCategoryElement(String categoryName) {
        return $(By.xpath("//*[contains(text(), " + "'" + categoryName + "'" + ") and contains(@class, 'v-navigation__label')]"));
    }

    private SelenideElement megaMenuBlock = $(By.xpath("(//*[contains(@class, 'v-navigation__list--level0')])[2]"));
    private SelenideElement firstCategoryLevelBlock = $(By.xpath("(//*[contains(@class, 'v-navigation__list--level1')])[4]"));
    private SelenideElement secondCategoryLevelBlockTitle = $(By.xpath("(//*[contains (@class, 'v-navigation__text') and contains (text(), 'Laatat')])[1]"));
}
