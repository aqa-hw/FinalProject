package mobile.finalProjectTests;

import mobile.config.base.BaseMethods;
import mobile.po.SkipPage;
import mobile.services.ArticleService;
import mobile.services.SearchService;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FirstTest extends BaseMethods {
    @Test
    void shouldBeArticleOpened() {
        new SkipPage().clickSkip();

        new SearchService().searchTest("Appium");

        var article = new ArticleService().getArticleName();

        assertThat(article).as("The article has wrong name").isEqualTo("Appium");
    }
}
