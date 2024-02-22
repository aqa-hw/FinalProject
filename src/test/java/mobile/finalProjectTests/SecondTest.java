package mobile.finalProjectTests;

import mobile.config.base.BaseMethods;
import mobile.po.ListSavedArticlePage;
import mobile.po.SavePage;
import mobile.po.SkipPage;
import mobile.services.ArticleService;
import mobile.services.ListSavedArticleService;

import org.testng.annotations.Test;

public class SecondTest extends BaseMethods {

    @Test
    void shouldBeListDeleted(){
        new SkipPage().clickSkip();
        new ArticleService().goToArticle();
        new ArticleService().saveImage();
        new SavePage().clickSaveButton();
        new ListSavedArticleService()
                .addToListArticle("MyList");
        new ListSavedArticlePage()
                .swipeElementRight(150);
        new ArticleService().deleteList();
    }
}
