package Homework6;

import Homework6.pages.HomePage;
import panels.AuthPanel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Authorization extends AbstractTest {
    @Test
    void test() {
        HomePage homePage = new HomePage(getEventDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword());

        Assertions.assertDoesNotThrow(homePage::getLoginButtonHeader);


    }
}
