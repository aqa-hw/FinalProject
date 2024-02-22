package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;



public class ListSavedArticlePage extends BaseMethods {

    private final By addToListButton = By.xpath("//android.widget.Button[@resource-id='org.wikipedia:id/snackbar_action']");

    private final By nameList = By.xpath("//android.widget.EditText[@resource-id=\"org.wikipedia:id/text_input\"]");

    private final By okButton = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");

    private final By viewList = By.xpath("//android.widget.Button[@resource-id=\"org.wikipedia:id/snackbar_action\"]");

    private final By appiumArticle = By.xpath("//android.view.ViewGroup[@resource-id=\"org.wikipedia:id/page_list_item_container\"]");

    public ListSavedArticlePage clickAddToListButton() {
        click(addToListButton);
        return this;
    }

    public ListSavedArticlePage fillNameList(String text) {
        sendKeys(nameList, text);
        return this;
    }

    public ListSavedArticlePage clickOkButton() {
        click(okButton);
        return this;
    }

    public ListSavedArticlePage viewList() {
        click(viewList);
        return this;
    }

    public void swipeElementRight(int time) {
        swipeElementRight(appiumArticle, time);
    }

}
