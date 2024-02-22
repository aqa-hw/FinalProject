package mobile.services;

import mobile.po.ArticlePage;

public class ArticleService {

    private final ArticlePage articlePage = new ArticlePage();

    public String getArticleName() {
        return articlePage
                .clickFirstArticle()
                .clickHeader()
                .getArticleName();
    }

    public void goToArticle(){
        articlePage
                .swipeToArticle()
                .clickFeaturedArticle()
                .popUpSkip();
    }
    public void saveImage(){
        articlePage
                .downloadPicture();
    }
    public void deleteList(){
        articlePage
                .clickThreeDot()
                .clickDeleteList()
                .confirmDeletion();
    }
}
