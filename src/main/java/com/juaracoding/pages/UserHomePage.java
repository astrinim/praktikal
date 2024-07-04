package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
//    @FindBy(xpath = "//div[@class='app_logo']")
//    WebElement homeText;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCart1;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addToCart2;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement viewCart;
    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    WebElement btnSidebar;
    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement btnLogout;

    private WebDriver driver;
    private final Actions actions;

    public UserHomePage(){
        this.driver = DriverSingleton.getDriver();
        this.actions = new Actions(this.driver);
        PageFactory.initElements(driver, this);
    }


//    public String getHomeText() {
//        return homeText.getText();
//    }
    public void clickAddToCart1(){
        this.addToCart1.click();
    }
    public void clickAddToCart2(){
        this.addToCart2.click();
    }

    public void clickViewCart(){
        this.viewCart.click();
    }

    public void clickSidebar(){
        this.btnSidebar.click();
    }
    public void clickLogout(){
        this.btnLogout.click();
    }
}
