package medikeeper.pages;

import medikeeper.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='ctl00$MainContent$loginForm$tbxLoginUsername']")
    private WebElement username;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$loginForm$tbxLoginPassword']")
    private WebElement password;
    @FindBy(xpath = "//a[@onclick='processLogin();']")
    private WebElement submitButton;


    public WebElement getUsername() {
        return username;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

}
