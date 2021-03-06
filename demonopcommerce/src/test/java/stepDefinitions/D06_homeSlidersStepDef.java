package stepDefinitions;
import Pages.P04_SliderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D06_homeSlidersStepDef {
    P04_SliderPage sliderPage = new P04_SliderPage();

@When("user clicks on first slider")
    public void first_Slider(){

    sliderPage.sliderNumber("1").click();
}

@Then("relative product for first slider is displayed")
    public void FirstSlider_IsDisplayed() throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");

}
@When("user clicks on second slider")
    public void second_Slider ()
{

    sliderPage.sliderNumber("2").click();
}
@Then("relative product for second slider is displayed")
    public void Second_IsDisplayed() throws InterruptedException {
    Thread.sleep(3000);
    Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone-6");
}

}
