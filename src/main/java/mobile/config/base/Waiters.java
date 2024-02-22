package mobile.config.base;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static mobile.config.driver.DriverInit.getDriver;
import static mobile.utils.Utils.f;

public class Waiters {

    protected AppiumDriver driver = getDriver();

    private WebDriverWait waiter(long timeOutSeconds) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeOutSeconds));
    }

    protected WebElement presence(By by) {
        return waiter(10)
                .withMessage(f("The element - %s is not found", by))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected WebElement presence(By by, long timeOfSeconds) {
        return waiter(timeOfSeconds)
                .withMessage(f("The element - %s is not found", by))
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }

    protected WebElement clickable(By by) {
        return waiter(10)
                .withMessage(f("The element - %s is not clickable", by))
                .until(ExpectedConditions.elementToBeClickable(by));
    }

    protected WebElement clickable(By by, long timeOfSeconds) {
        return waiter(timeOfSeconds)
                .withMessage(f("The element - %s is not clickable", by))
                .until(ExpectedConditions.elementToBeClickable(by));
    }
}
