package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D08_WishlistStepDef {
    P01_RegisterPage registerPage = new P01_RegisterPage();
    @When("user chooses product and press wishlist Tab")
    public void productAdded(){

        registerPage.wishListElements().click();
    }
    @Then("notification message is displayed successfully")
    public void wishListMessageIsDisplayed()
    {
       String actualResult=registerPage.notificationMessage().getText();
        String expectedResult = "The product has been added to your wishlist";
        Assert.assertEquals(actualResult,expectedResult);

    }
}
