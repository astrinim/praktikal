package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // Locator use Page Factory
    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameInput;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    WebElement btnLogin;

    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement textSwagLabs;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement btnSidebar;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement btnLogout;


    // Step Action
    public void login(String username, String password){
        this.usernameInput.sendKeys(username);
        this.passwordInput.sendKeys(password);
        btnLogin.click();
    }

    // buatkan method logout
    public void logout(){
        btnSidebar.click();
        btnLogout.click();
    }

    public void setUsernameInput(String username){
        this.usernameInput.sendKeys(username);
    }

    public void setPasswordInput(String password){
        this.passwordInput.sendKeys(password);
    }

    public void clickLoginBtn(){
        btnLogin.click();
    }

    // Step Validation
    public String getTextSwagLabs(){
        return textSwagLabs.getText();
    }

}
