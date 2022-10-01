package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Getter
@Setter
public abstract class BasicPage {

    private final SelenideElement SEARCH_FIELD = $(By.xpath("//input[@id='search']"));
    private final SelenideElement LOGO = $(By.xpath("//*[@class='logo']"));
    private final SelenideElement STORE_SELECTOR = $(By.
            xpath("//div[@class='header content-wrapper']//following-sibling::*[@class='store-selector']"));
    private final SelenideElement USER_ACCOUNT_BUTTON = $(By.cssSelector(".header .links.wrapper"));
    private final SelenideElement MINI_CART_BUTTON = $(By.cssSelector(".minicart-wrapper.sidenav-trigger"));
    private String pageUlr;



}
