package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    //P01_RegisterPage registerPage= new P01_RegisterPage();

    @Given("user clicks on login Tab and goes to Login page")
    public void clickOnLogin(){
        Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();

    }
    @When("click in login bottom")
    public void validLogin() throws InterruptedException{
        Hooks.driver.findElement(By.cssSelector("div[class=\"buttons\"] button[type=\"submit\"]")).click();
    }
    @Then("Check that user login correctly")
    public void checkLogin()
    {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/","home");
        soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
        soft.assertAll();
    }
}

