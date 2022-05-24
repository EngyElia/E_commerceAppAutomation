package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
P01_RegisterPage registerPage = new P01_RegisterPage();

@When("user clicks on first slider")
    public void first_Slider(){

    registerPage.sliderNumber("1").click();
}

@Then("relative product for first slider is displayed")
    public void FirstSlider_IsDisplayed() throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");

}
@When("user clicks on second slider")
    public void second_Slider ()
{

    registerPage.sliderNumber("2").click();
}
@Then("relative product for second slider is displayed")
    public void Second_IsDisplayed() throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
}

}
