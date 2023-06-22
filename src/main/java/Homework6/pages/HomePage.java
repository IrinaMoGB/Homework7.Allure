package Homework6.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public final WebDriver driver;

    @FindBy(xpath = ".//a[text()='Войти']")
    public WebElement loginButtonHeader;
    @FindBy(xpath = "a[contains(@href, 'https://shop.tastycoffee.ru/coffee?methods=3a%2C4a')]")
    public WebElement linkTextCoffee;
    @FindBy(xpath = "//*[@id=\"catalog-products\"]/div[1]/div[4]/form/div[4]/div/a")
    public WebElement addButton;
    @FindBy(xpath = "/html/body/div[1]/header/div[1]/div/div[10]/div[1]/ul/li[4]/a")
    public WebElement linkTextChocolate;
    @FindBy(xpath = "(//a[@onclick='add_in_cart(this);return false;'])[2]")
    public WebElement buyButton;
    @FindBy(xpath = "//a[contains(text(),'Перейти в корзину')]")
    public WebElement linkTextCart;
    @FindBy(xpath = "//*[@id=\"city_popup\"]/form/div[2]/div/div[4]/a")
    public WebElement citySelectionButton;
    @FindBy(xpath = "//*[@id=\\\"city_open\\\"]/span[1]")
    public WebElement citySTPetersburg;
    @FindBy(xpath = "//a[contains(text(),'Каналы')]")
    public WebElement channelsButton;
    @FindBy(xpath = "//input[@name='community_q']")
    public WebElement searchButton;
    @FindBy(css = ".search-community__input\"")
    public WebElement searchInput;
    @FindBy(xpath = "//input[@name='community_q']")
    public WebElement loginButtonWindow;
    @FindBy(css = "/html/body/div[3]/div[2]/div/form/div/div/input")
    public WebElement searchCoffee;
    @FindBy(xpath = "//a[contains(text(),'Кофе для бизнеса')")
    public WebElement linkTextBusinessCoffee;
    @FindBy(xpath = "//div[@id='get-prices']")
    public WebElement linkTextGetPrices;
    @FindBy(xpath = "//a[contains(text(),'О компании')]")
    public WebElement linkTextAboutCompany;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLoginButtonHeader() {
        return loginButtonHeader;
    }

    public WebElement getlinkTextCoffee() {
        return linkTextCoffee;
    }

    public WebElement getaddButton() {
        return addButton;
    }

    public WebElement getlinkTextChocolate() {
        return linkTextChocolate;
    }

    public WebElement getbuyButton() {
        return buyButton;
    }

    public WebElement getlinkTextCart() {
        return linkTextCart;
    }

    public WebElement getcitySelectionButton() {
        return citySelectionButton;
    }

    public WebElement getcitySTPetersburg() {
        return citySTPetersburg;
    }

    public WebElement getchannelsButton() {
        return channelsButton;
    }

    public WebElement getloginButtonWindow() {
        return loginButtonWindow;
    }

    public WebElement getsearchButton() {return searchButton; }

    public WebElement getsearchInput() {return searchInput; }

    public WebElement getsearchCoffee() {return searchCoffee; }

    public WebElement getlinkTextBusinessCoffee() {
        return linkTextBusinessCoffee;
    }

    public WebElement getlinkTextGetPrices() {
        return linkTextGetPrices;
    }

    public WebElement getlinkTextAboutCompany() {
        return linkTextAboutCompany;
    }

    public HomePage clickOnElement(WebElement webElement) {
        webElement.click();
        return this;
    }

    public HomePage moveToElement(WebElement webElement) {
        new Actions(driver).moveToElement(webElement).perform();
        return this;
    }

    public HomePage inputSearch(String text) {
        searchInput.clear();
        searchInput.sendKeys(text);
        return this;
    }

    public HomePage searchCoffee (String text) {
        searchInput.clear();
        searchInput.sendKeys(text);
        return this;
    }

}
