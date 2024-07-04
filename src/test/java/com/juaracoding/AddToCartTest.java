package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.UserHomePage;
import com.juaracoding.pages.LoginPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.AfterAll;
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


    public AddToCartTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @Given("User click button Addtocart1")
    public void user_click_button_addtocart1(){
        userHomePage.clickAddToCart1();
        extentTest.log(LogStatus.PASS, "User click button Addtocart1");
    }
    @When("User click button Addtocart2")
    public void user_click_button_addtocart2(){
        userHomePage.clickAddToCart2();
        extentTest.log(LogStatus.PASS, "User click button Addtocart2");
    }

    @And("User click icon cart")
    public void user_click_icon_cart(){
        userHomePage.clickViewCart();
        extentTest.log(LogStatus.PASS, "User click icon cart");
    }
    @Then("User addtocart successful")
    public void user_addtocart_successful(){
        //Assert.assertEquals(userHomePage.getHomeText(), "SwagLabs");
        //extentTest.log(LogStatus.PASS, "User addtocart successful");

    }
    @When("User click sidebar")
    public void user_click_sidebar(){
        userHomePage.clickSidebar();
        extentTest.log(LogStatus.PASS, "User click sidebar");
    }

    @And("User click logout")
    public void user_click_logout(){
        userHomePage.clickLogout();
        extentTest.log(LogStatus.PASS, "User click logout");
    }
    @Then("User logout succesfull")
    public void user_logout_succesfull(){
        //extentTest.log(LogStatus.PASS, "User logout successful");
    }
}
