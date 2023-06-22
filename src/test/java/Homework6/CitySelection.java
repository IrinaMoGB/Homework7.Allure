package Homework6;

import Homework6.pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CitySelection extends AbstractTest {
    @Test
    void test() {
        HomePage homePage = new HomePage(getEventDriver());

        HomePage homePage1 = homePage
                .moveToElement(homePage.getcitySelectionButton())
                .clickOnElement(homePage.getcitySTPetersburg());

        Assertions.assertDoesNotThrow(homePage::getcitySTPetersburg);
    }
}
