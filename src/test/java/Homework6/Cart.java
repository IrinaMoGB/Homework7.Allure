package Homework6;

import Homework6.pages.HomePage;
import panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Cart extends AbstractTest {
    @Test
    void test() {
        HomePage homePage = new HomePage(getEventDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword());

        HomePage homePageAfter = new HomePage(getEventDriver());
        homePageAfter
                .clickOnElement(homePageAfter.getlinkTextCoffee())
                .clickOnElement(homePageAfter.getaddButton());


        HomePage cartPage = new HomePage(getEventDriver());
        cartPage
                .clickOnElement(cartPage.getlinkTextChocolate())
                .clickOnElement(cartPage.getbuyButton())
                .clickOnElement(cartPage.getlinkTextCart());

        ;

        Assertions.assertDoesNotThrow(cartPage::getlinkTextCart);
    }
}
