package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
    P01_RegisterPage registerPage =  new P01_RegisterPage();
    @When("user enter product name and clicks on Search button")
    public  void search() throws InterruptedException {
        registerPage.search_Text().sendKeys("Apple");

        registerPage.search_Button().click();

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
        registerPage.search_Text().sendKeys("AP_MBP_13");

        registerPage.search_Button().click();
    }

    @Then("SKU results is displayed")
    public void skuResultsIsDisplayed() {

        SoftAssert softAssert =new SoftAssert();
        String expectedResult = "AP_MBP_13";
        String actualResult = Hooks.driver.getCurrentUrl();
        softAssert.assertTrue(actualResult.contains(expectedResult));

        softAssert.assertTrue(registerPage.gridItem() > 0);
        softAssert.assertAll();

    }
}
