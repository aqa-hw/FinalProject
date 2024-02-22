package mobile.finalProjectTests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static mobile.config.driver.DriverInit.getDriver;
import static mobile.config.driver.DriverInit.quit;

public class BaseTest {

    protected static AppiumDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = getDriver();
    }

    @AfterMethod
    public void close() {
        quit();
    }
}