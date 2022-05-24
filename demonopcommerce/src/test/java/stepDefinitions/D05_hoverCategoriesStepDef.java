package stepDefinitions;

import Pages.P02_HoverCategoriesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    P02_HoverCategoriesPage hoverPage = new P02_HoverCategoriesPage();
    String category_lowerCase;
    String subcategory_Lowercase;


    @When("user hover category {string} and select subcategory {string}")
    public void user_hover_category(String category,String subcategory){
        category_lowerCase = category.toLowerCase();
        subcategory_Lowercase = subcategory.toLowerCase();
        hoverPage.hover_Categories(category_lowerCase).click();
        hoverPage.hover_subCategory(subcategory_Lowercase).click();

    }
    @Then("subcategory is displayed correctly")
    public void subcategoryIsDisplayed()
    {
        String expectedResult = subcategory_Lowercase;
        String actualResult = hoverPage.subCategoryTitle().getText().toLowerCase();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
