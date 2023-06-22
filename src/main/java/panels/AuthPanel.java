package panels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthPanel {
    public final WebDriver driver;
    @FindBy(xpath = "//*[@id=\\\"email\\\"]")
    public WebElement inputEmailField;
    @FindBy(xpath = ".//input[@id = 'password']")
    public WebElement inputPasswordField;

    public String login = "irinamo.coffee@gmail.com";
    public String password = "Ilovecoffee1";

    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }

    public AuthPanel(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputEmailField() {
        return inputEmailField;
    }

    public WebElement getInputPasswordField() {
        return inputPasswordField;
    }

    public AuthPanel clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public AuthPanel moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public AuthPanel inputLogin(String login) {
        inputEmailField.clear();
        inputEmailField.sendKeys(login);
        return this;
    }

    public AuthPanel inputPassword(String password) {
        inputPasswordField.clear();
        inputPasswordField.sendKeys(password);
        return this;
    }
}
