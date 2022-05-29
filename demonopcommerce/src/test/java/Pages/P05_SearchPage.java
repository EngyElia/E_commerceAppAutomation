package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P05_SearchPage {
    public WebElement search_Text() {
        WebElement search = Hooks.driver.findElement(By.id("small-searchterms"));
        return search;
    }

    public WebElement search_Button() {
        WebElement search_button = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return search_button;
    }


    public Integer gridItem() {
        return Hooks.driver.findElements(By.className("item-grid")).size();

    }

}
