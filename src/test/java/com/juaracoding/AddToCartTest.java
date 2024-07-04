package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.UserHomePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartTest {
    private static WebDriver driver;
    private static UserHomePage userHomePage = new UserHomePage();
    private static ExtentTest extentTest;


    @Given("User click button Addtocart")
    public void user_click_button_addtocart(){
        userHomePage.clickAddToCart();
        extentTest.log(LogStatus.PASS, "User click login button");
    }

    @When("User click icon cart")
    public void user_click_icon_cart(){
        userHomePage.clickViewCart();
        extentTest.log(LogStatus.PASS, "User click icon cart");
    }

    @Then("User addtocart successful")
    public void user_addtocart_successful(){
        Assert.assertEquals(userHomePage.getHomeText(), "SwagLabs");
        extentTest.log(LogStatus.PASS, "User addtocart successful");
    }
}
