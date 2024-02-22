package mobile.config.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class BaseMethods extends Waiters {

    protected void click(By by) {
        getElement(by, true, true).click();
    }

    protected void sendKeys(By by, String text) {
        middle(by, true).sendKeys(text);
    }

    protected String getText(By by) {
        return middle(by, true).getText();
    }


    protected void getPhotoFromArticle(By by) {
        WebElement element = middle(by, true);

        try {
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            BufferedImage screenshotImage = ImageIO.read(screenshotFile);

            Point location = element.getLocation();
            int width = element.getSize().getWidth();
            int height = element.getSize().getHeight();

            BufferedImage elementImage = screenshotImage.getSubimage(location.getX(), location.getY(), width, height);

            File outputFile = new File("article_photo.png");
            ImageIO.write(elementImage, "png", outputFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    private boolean isElementVisible(By by) {
        try {
            return driver.findElement(by).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    private WebElement getElement(By by, Boolean presence, Boolean clickable) {
        if (presence) presence(by);
        if (clickable) clickable(by);
        return driver.findElement(by);
    }

    private WebElement middle(By by, Boolean presence) {
        if (presence) presence(by);
        return driver.findElement(by);
    }
    protected void performSwipe(By by, int startX, int startY, int endX, int endY, int time) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence swipe = new Sequence(finger, 1);
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startX, startY));
        swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.MIDDLE.asArg()));
        swipe.addAction(new Pause(finger, Duration.ofMillis(time)));
        swipe.addAction(finger.createPointerMove(Duration.ofMillis(time), PointerInput.Origin.viewport(), endX, endY));
        swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.MIDDLE.asArg()));
        driver.perform(List.of(swipe));
    }

    protected void swipeUp(By by, int time) {
        for (int i = 0; i < 5; i++) {
            if (isElementVisible(by)) {
                break;
            }
            Dimension dimension = driver.manage().window().getSize();
            int x = dimension.width / 2;
            int start = (int) (dimension.height * 0.7);
            int end = (int) (dimension.height * 0.3);
            performSwipe(by, x, start, x, end, time);
        }
    }

    protected void swipeElementRight(By by, int time) {
        WebElement element = middle(by, true);
        int startX = element.getLocation().getX() + element.getSize().getWidth() / 2;
        int startY = element.getLocation().getY() + element.getSize().getHeight() / 2;
        int endX = startX - 500;
        performSwipe(by, startX, startY, endX, startY, time);
    }

}
