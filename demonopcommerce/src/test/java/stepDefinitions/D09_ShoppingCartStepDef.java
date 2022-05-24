package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D09_ShoppingCartStepDef {
    P01_RegisterPage registerPage = new P01_RegisterPage();

    @When("user chooses product and clicks on Shopping Cart")
    public void productAddedToCart()
    {
        registerPage.productAddedToCart().click();
    }
    @Then("Shopping Cart message is displayed successfully")
    public void messageDisplayed()
    {
        String actualResult=registerPage.notificationMessage().getText();
        String expectedResult = "The product has been added to your shopping cart";
        Assert.assertEquals(actualResult,expectedResult);

    }

}
