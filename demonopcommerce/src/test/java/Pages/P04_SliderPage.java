package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P04_SliderPage {
    public WebElement sliderNumber(String sliderNumber) {
        WebElement slider = Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[" + sliderNumber + "]"));
        return slider;
    }
}
