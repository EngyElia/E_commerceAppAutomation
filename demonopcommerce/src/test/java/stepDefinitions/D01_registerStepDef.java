package stepDefinitions;

import Pages.P01_RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {

    P01_RegisterPage registerPage= new P01_RegisterPage();


    @Given("user clicks on Register Tab")
    public void clickOnRegister()
    {

        registerPage.getregisterTabElement().click();
    }
    @And("user fills Personal Details")
    public void requiredData() {

        registerPage.genderFemale().click();
        registerPage.getFirstNameElement().sendKeys("Engy");
        registerPage.getLastNameElement().sendKeys("Elia");
    }
       @And("user put her birthdate")
       public void birthdate (){
        registerPage.dataOfBirthDay().click();
           registerPage.dataOfBirthMonth().click();
           registerPage.dataOfBirthYear().click();
    }
      @And("^user put email\"(.*)\"$")
      public void   email_and_company (String email){
          registerPage.getEmail().sendKeys("automation@gmail.com");


    }
    @And("company name") public void company(){
        registerPage.getCompanyName().sendKeys("Automation Company");
    }

@And("^put password\"(.*)\"$")
public void password(String password){
        registerPage.getPassword().sendKeys("P@ssw0rd");

}
    @When("user put her password and click register")
      public void password_register(){

          registerPage.confirmPassword().sendKeys("P@ssw0rd");
          registerPage.registerButton().click();
      }




    @Then("check that user register successfully")
    public void CheckRegister(){

        SoftAssert soft=new SoftAssert();

        soft.assertTrue(Hooks.driver.findElement(By.className("result")).isDisplayed());
        String color=Hooks.driver.findElement(By.className("result")).getCssValue("color");
        System.out.println("color:"+ color);
        soft.assertAll();
        Hooks.driver.findElement(By.cssSelector("a[href=\"/logout\"]")).click();
    }




}
