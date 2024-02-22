package mobile.po;

import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;



public class LoginPage extends BaseMethods {
    private final By moreButton = By.xpath("//android.widget.ImageView[@resource-id=\"org.wikipedia:id/menu_icon\"]");
    private final By loginJoinButton = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/main_drawer_login_button\"]");
    private final By loginButton = By.xpath("//android.widget.Button[@resource-id=\"org.wikipedia:id/create_account_login_button\"]");
    private final By usernameField = By.xpath("//android.widget.EditText[@text=\"Username\"]");
    private final By passwordField = By.xpath("//android.widget.EditText[@text=\"Password\"]");
    private final By mainLoginButton = By.xpath("//android.widget.Button[@resource-id=\"org.wikipedia:id/login_button\"]");

    private final By watchList = By.xpath("//android.widget.TextView[@text=\"Watchlist\"]");


    public LoginPage clickMoreButton() {
        click(moreButton);
        return new LoginPage();
    }

    public LoginPage clickLoginJoinButton() {
        click(loginJoinButton);
        return new LoginPage();
    }

    public void clickLoginButton() {
        click(loginButton);
        new LoginPage();
    }


    public void userCredentials(String text, String password) {
        sendKeys(usernameField, text);
        sendKeys(passwordField, password);
        new LoginPage();
    }


    public void clickMainLoginButton() {
        click(mainLoginButton);
        new LoginPage();
    }
    public String getWatchList(){
        return getText(watchList);
    }

}

