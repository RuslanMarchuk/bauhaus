package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class PageHeader {

    private SelenideElement searchField = $(By.xpath("//input[@id='search']"));
    private SelenideElement logo = $(By.xpath("//*[@class='logo']"));
    private SelenideElement storeSelector = $(By.
            xpath("//div[@class='header content-wrapper']//following-sibling::*[@class='store-selector']"));
    private SelenideElement userAccountButton = $(By.cssSelector(".header .links.wrapper"));
    private SelenideElement miniCartButton = $(By.cssSelector(".minicart-wrapper.sidenav-trigger"));
    private SelenideElement logoImage = $(By.xpath("//*[@class='logo']/img"));
}
