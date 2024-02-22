package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class SearchPage extends BaseMethods {

    private final By search = By.xpath("//*[@text='Search Wikipedia']");
    private final By input = By.id("org.wikipedia:id/search_src_text");

    public SearchPage clickOnSearchField() {
        click(search);
        return new SearchPage();
    }

    public void fillInput(String text) {
        sendKeys(input, text);
        new SearchPage();
    }
}
