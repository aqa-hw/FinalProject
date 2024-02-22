package mobile.finalProjectTests;

import mobile.config.base.BaseMethods;
import mobile.config.builders.LoginCredentials;
import mobile.config.builders.LoginCredentialsBuilder;
import mobile.po.SkipPage;
import mobile.services.LoginService;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class ThirdTest extends BaseMethods {

    @Test
    void shouldBeLoggedIn(){

        new SkipPage().clickSkip();
        new LoginService().clickLoginButtons();
        LoginCredentials credentials = LoginCredentialsBuilder.fromSystemProperties().build();
        new LoginService().performLogin(credentials);

        var watchList = new LoginService().getWatchList();

        assertThat(watchList).as("Watchlist is visible for logged account").isEqualTo("Watchlist");
    }
}
