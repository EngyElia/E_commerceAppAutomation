package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinitions.Hooks;

public class P02_HoverCategoriesPage {

    public WebElement hover_Categories(String category){

        WebElement categories = Hooks.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/"+category+"\"]"));
        return categories;
    }
    public WebElement hover_subCategory(String subCategory)
    {
       WebElement subCateg = Hooks.driver.findElement(By.cssSelector("li>ul[class=\"sublist\"]>li>a[href=\"/"+subCategory +"\"]"));
       return subCateg;
    }
    public WebElement subCategoryTitle(){

        WebElement page= Hooks.driver.findElement(By.className("page-title"));
        return page;
    }
}
