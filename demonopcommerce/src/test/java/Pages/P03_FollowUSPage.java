package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P03_FollowUSPage {
    public WebElement facebook_Link()
    {
        WebElement facebook = Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
        return facebook;
    }
    public WebElement twitter_Link()
    {
        WebElement twitter = Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
        return twitter;
    }
    public WebElement rss_Link()
    {
        WebElement rss = Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
        return rss;
    }
    public WebElement youtube_Link()
    {
        WebElement youtube = Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
        return youtube;
    }
}
