package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class SkipPage extends BaseMethods {

    private final By skip = By.id("org.wikipedia:id/fragment_onboarding_skip_button");

    public void clickSkip() {
        click(skip);
    }
}
