package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P01_RegisterPage registerPage = new P01_RegisterPage();

    @When("user chooses currency")
    public void choose_currency()
    {
        registerPage.selectCurrency().click();
        registerPage.euro_Currency().click();
    }
    @Then("currency is displayed correctly")
    public void currencySelected()
    {
        String expectedResult="€";
        String actualResult=registerPage.price().getText() ;
        Assert.assertTrue( actualResult.contains(expectedResult));

    }
}
