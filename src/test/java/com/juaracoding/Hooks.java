package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.utils.TestCase;
import com.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks {
    static WebDriver driver;
    static ExtentTest extentTest;

    static ExtentReports reports = new ExtentReports("target/extent-reports.html");

    @Before
    public static void setUp(){
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        TestCase[] test = TestCase.values();
        extentTest = reports.startTest(test[Utils.testCount].getTestCaseName()).assignCategory(test[Utils.testCount].getModuleName()).assignAuthor(test[Utils.testCount].getAuthorName());
        Utils.testCount++;
    }


    @After
    public void endTestCase(){
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void finish(){
        DriverSingleton.delay(3);
        DriverSingleton.closeObjectInstance();
    }
}
