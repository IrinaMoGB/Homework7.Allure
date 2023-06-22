package Homework6;

import Homework7.MyWebDriverEventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import java.time.Duration;

public abstract class AbstractTest {
    static EventFiringWebDriver eventDriver;

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        eventDriver = new EventFiringWebDriver(new ChromeDriver(options));
        eventDriver.register(new MyWebDriverEventListener());
        eventDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @BeforeEach
    void initMainPage() {
        Assertions.assertDoesNotThrow(() -> getEventDriver().navigate().to("https://shop.tastycoffee.ru"),
                "Страница не доступна");
        Assertions.assertTrue(true);

    }

    @AfterAll
    static void close() {
        eventDriver.quit();
    }

    public static EventFiringWebDriver getEventDriver() {
        return eventDriver;
    }
}
