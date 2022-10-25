package pages;

import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class TopNavigationMenu {

    private SelenideElement megaMenu = $(By.xpath("//li[contains(@class, ' v-navigation__item--main')][1]"));

    public SelenideElement getMegaMenuCategoryElement(String categoryName) {
        return $(By.xpath("//*[contains(text(), " + "'" + categoryName + "'" + ") and contains(@class, 'v-navigation__label')]"));
    }
}
