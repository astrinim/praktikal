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

public class LoginSauceTest {
    private static WebDriver driver;
    private static LoginPage loginPage = new LoginPage();
    private static UserHomePage userHomePage = new UserHomePage();
    private static ExtentTest extentTest;
    public LoginSauceTest(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
        @Given("User enter URL web Sauce")
    public void user_enter_url_web_sauce(){
        String url = "https://www.saucedemo.com/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        extentTest.log(LogStatus.PASS, "User enter URL web Sauce");
    }
    @When("User input valid username")
    public void user_input_valid_username(){
        String username = "standard_user";
        loginPage.setUsernameInput(username);
        extentTest.log(LogStatus.PASS, "User enter valid username");
    }
    @And("User input valid password")
    public void user_input_valid_password(){
        String password = "secret_sauce";
        loginPage.setPasswordInput(password);
        extentTest.log(LogStatus.PASS, "User enter valid password");
    }
    @And("User click login button")
    public void user_click_login_button(){
        loginPage.clickLoginBtn();
        extentTest.log(LogStatus.PASS, "User click login button");
    }
    @Then("User login successful")
    public void user_login_successful(){
        Assert.assertEquals(loginPage.getTextSwagLabs(), "SwagLabs");
        extentTest.log(LogStatus.PASS, "User login successful");
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
