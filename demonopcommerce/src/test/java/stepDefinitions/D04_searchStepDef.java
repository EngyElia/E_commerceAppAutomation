package stepDefinitions;

import Pages.P01_RegisterPage;
import Pages.P05_SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P05_SearchPage searchPage = new P05_SearchPage();
    @When("user enter product name and clicks on Search button")
    public  void search() throws InterruptedException {
        searchPage.search_Text().sendKeys("Apple");

        searchPage.search_Button().click();

    }

    @Then("result is displayed successfully")
    public void resultIsDisplayedSuccess() {
        String expectedResult = "search?q=Apple";
        String actualResult = Hooks.driver.getCurrentUrl();
    Assert.assertTrue(actualResult.contains(expectedResult));

    }
    @When("user enter SKU and clicks on Search button")
    public void sKUSearch()
    {
        searchPage.search_Text().sendKeys("AP_MBP_13");

        searchPage.search_Button().click();
    }

    @Then("SKU results is displayed")
    public void skuResultsIsDisplayed() {

        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "AP_MBP_13";
        String actualResult = Hooks.driver.getCurrentUrl();
        softAssert.assertTrue(actualResult.contains(expectedResult));

        softAssert.assertTrue(searchPage.gridItem() > 0);
        softAssert.assertAll();

    }
}
