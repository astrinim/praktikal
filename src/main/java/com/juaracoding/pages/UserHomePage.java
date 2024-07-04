package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserHomePage {
    @FindBy(xpath = "//div[@class='app_logo']")
    WebElement homeText;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCart;
    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    WebElement viewCart;

    private WebDriver driver;
    private final Actions actions;

    public UserHomePage(){
        this.driver = DriverSingleton.getDriver();
        this.actions = new Actions(this.driver);
        PageFactory.initElements(driver, this);
    }


    public String getHomeText() {
        return homeText.getText();
    }
    public void clickAddToCart(){
        this.addToCart.click();
    }
    public void clickViewCart(){
        this.viewCart.click();
    }

}
