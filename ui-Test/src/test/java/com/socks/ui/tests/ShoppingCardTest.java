package com.socks.ui.tests;

import com.codeborne.selenide.WebDriverRunner;
import com.socks.ui.CatalogPage;
import com.socks.ui.ShoppingCardPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.*;

public class ShoppingCardTest extends BaseUITest {
    @Test
    public void userCanAddItemToCardFromCatalog() {
        CatalogPage.open()
        .addItemByIndex(0)
        .goToCard();

        at(ShoppingCardPage.class).totalAmount().shouldHave(exactText("$104.98"));
    }

    @Test
    public void testCanDeleteItemFromCart() {
        ShoppingCardPage.open();

        String cookies = WebDriverRunner.getWebDriver().manage().getCookieNamed("md.sid").getValue();


    }
}
