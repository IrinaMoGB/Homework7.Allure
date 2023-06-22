package Homework6;

import Homework6.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import panels.AuthPanel;

public class Wholesale extends AbstractTest {
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
                .clickOnElement(homePageAfter.getlinkTextBusinessCoffee())
                .clickOnElement(homePageAfter.getlinkTextGetPrices())
                .clickOnElement(homePageAfter.getlinkTextAboutCompany());

        Assertions.assertEquals("https://tastycoffee.ru/personal/", getEventDriver().getCurrentUrl());

        //Assertions.assertDoesNotThrow(homePage::getlinkTextAboutCompany);
    }


}
