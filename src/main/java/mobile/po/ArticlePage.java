package mobile.po;


import mobile.config.base.BaseMethods;
import org.openqa.selenium.By;

public class ArticlePage extends BaseMethods {

    private final By firstArticle =
            By.xpath("//*[@resource-id='org.wikipedia:id/search_results_list']/android.view.ViewGroup[1]");
    private final By articleName = By.xpath("(//android.widget.TextView[@text='Appium'])[1]");
    private final By photo = By.xpath("//android.widget.ImageView[@resource-id=\"org.wikipedia:id/view_page_header_image\"]");

    private final By header = By.xpath("//android.widget.TextView[@resource-id=\"History\"]");

    private final By featuredArticle = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/articleTitle\"]");

    private final By popUpSkip = By.xpath("//android.view.View[@resource-id=\"pcs\"]/android.view.View[1]");

    private final By threeDots = By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]");

    private final By deleteList = By.xpath("//android.widget.TextView[@resource-id=\"org.wikipedia:id/title\" and @text=\"Delete list\"]");

    private final By confirmDeleteButton = By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]");
    public ArticlePage clickFirstArticle() {
        click(firstArticle);
        return new ArticlePage();
    }

    public String getArticleName() {
        return getText(articleName);
    }

    public void downloadPicture() {
        getPhotoFromArticle(photo);
    }
    public ArticlePage clickHeader(){
        click(header);
        return new ArticlePage();
    }
    public ArticlePage swipeToArticle(){
        swipeUp(featuredArticle, 900);
        return new ArticlePage();
    }
    public ArticlePage clickFeaturedArticle() {
        click(featuredArticle);
        return new ArticlePage();
    }
    public ArticlePage popUpSkip(){
        click(popUpSkip);
        return new ArticlePage();
    }
    public ArticlePage clickThreeDot(){
        click(threeDots);
        return new ArticlePage();
    }
    public ArticlePage clickDeleteList(){
        click(deleteList);
        return new ArticlePage();
    }
    public ArticlePage confirmDeletion(){
        click(confirmDeleteButton);
        return new ArticlePage();
    }
}
