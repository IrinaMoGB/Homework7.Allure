package Homework6;

import Homework6.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import panels.AuthPanel;

public class Search extends AbstractTest {
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
                .clickOnElement(homePageAfter.getloginButtonWindow())
                .searchCoffee("колумбия")
                .clickOnElement(homePageAfter.getloginButtonWindow());

        Assertions.assertDoesNotThrow(homePage::getloginButtonWindow);

    }
}

