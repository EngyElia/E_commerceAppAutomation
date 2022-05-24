package stepDefinitions;

import Pages.P03_FollowUSPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {
    P03_FollowUSPage followUSPage = new P03_FollowUSPage();
    @When("user opens Facebook Link")
    public void clickOnFacebook()
    {
        followUSPage.facebook_Link().click();
    }
    @When("user opens Twitter Link")
    public void twitterOpened()
    {
        followUSPage.twitter_Link().click();
    }
    @When("user opens Rss Link")
    public void rssOpened()
    {
        followUSPage.rss_Link().click();
    }
    @When("user opens Youtube Link")
    public void youtubeOpened()
    {
        followUSPage.youtube_Link().click();
    }


    @Then("{string} is opened in new Tab")
    public void isOpenedInNewTab(String linkType) {

        ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        String actualResult;
        String expectedResult;
        switch (linkType) {

            case "facebook":
                Hooks.driver.switchTo().window(Tabs.get(1));
                actualResult = Hooks.driver.getCurrentUrl();
                expectedResult ="https://www.facebook.com/nopCommerce";
                Assert.assertEquals(actualResult,expectedResult);
                break;

            case "twitter":
                Hooks.driver.switchTo().window(Tabs.get(1));
                actualResult = Hooks.driver.getCurrentUrl();
                expectedResult ="https://twitter.com/nopCommerce";
                Assert.assertEquals(actualResult,expectedResult);
                break;

            case "rss":
                actualResult = Hooks.driver.getCurrentUrl();
                expectedResult = "https://demo.nopcommerce.com/new-online-store-is-open";
                Assert.assertEquals(actualResult,expectedResult);
                break;

            case "youtube":
                Hooks.driver.switchTo().window(Tabs.get(1));
                actualResult = Hooks.driver.getCurrentUrl();
                expectedResult = "https://www.youtube.com/user/nopCommerce";
                Assert.assertEquals(actualResult,"https://www.youtube.com/user/nopCommerce");
                break;

        }
    }
}
