package Pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;

public class P01_RegisterPage {


    public WebElement getregisterTabElement() {
        By registerTab = By.className("ico-register");
        WebElement register = Hooks.driver.findElement(registerTab);
        return register;
    }

//    public WebElement getLoginTabElement() {
//        By loginTab = By.className("ico-login");
//        WebElement login = Hooks.driver.findElement(loginTab);
//        return login;
//    }

    public WebElement genderMale() {

        WebElement male = Hooks.driver.findElement(By.id("gender-male"));
        return male;
    }

    public WebElement genderFemale() {

        WebElement famle = Hooks.driver.findElement(By.id("gender-female"));
        return famle;
    }


    public WebElement getFirstNameElement() {
        By firstName = By.id("FirstName");
        WebElement firstNameElement = Hooks.driver.findElement(firstName);
        return firstNameElement;
    }

    public WebElement getLastNameElement() {
        By lastName = By.id("LastName");
        WebElement lastNameElement = Hooks.driver.findElement(lastName);
        return lastNameElement;
    }


    public WebElement dataOfBirthDay() {
        WebElement day = Hooks.driver.findElement(By.cssSelector("option[value=\"20\"]"));
        return day;
    }

    public WebElement dataOfBirthMonth() {

        WebElement month = Hooks.driver.findElement(By.cssSelector("option[value=\"11\"]"));
        return month;
    }

    public WebElement dataOfBirthYear() {
        WebElement year = Hooks.driver.findElement(By.cssSelector("option[value=\"1992\"]"));
        return year;
    }

    public WebElement getCompanyName() {
        By companyName = By.id("Company");
        WebElement companyNameElement = Hooks.driver.findElement(companyName);
        return companyNameElement;
    }

    public WebElement getEmail() {

        WebElement email = Hooks.driver.findElement(By.id("Email"));
        return email;
    }

    public WebElement getPassword() {
        By password = By.id("Password");
        WebElement passwordElement = Hooks.driver.findElement(password);
        return passwordElement;
    }

    public WebElement confirmPassword() {
        By confirmPassword = By.id("ConfirmPassword");
        WebElement confirmPasswordElement = Hooks.driver.findElement(confirmPassword);
        return confirmPasswordElement;
    }

    public WebElement registerButton() {
        By registerB = By.id("register-button");
        WebElement registerButton = Hooks.driver.findElement(registerB);
        return registerButton;
    }

    //    public WebElement loginButton () {
//        WebElement loginButton = Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
//        return loginButton;
//    }
    public WebElement selectCurrency() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement euro_Currency() {
        WebElement select_Euro = Hooks.driver.findElement(By.xpath("//option[@value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
        return select_Euro;
    }
    public WebElement price(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }


    public WebElement search_Text() {
        WebElement search = Hooks.driver.findElement(By.id("small-searchterms"));
        return search;
    }

    public WebElement search_Button() {
        WebElement search_button = Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return search_button;
    }

    public WebElement sliderNumber(String sliderNumber) {
        WebElement slider = Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[" + sliderNumber + "]"));
        return slider;
    }

    public Integer gridItem() {
        return Hooks.driver.findElements(By.className("item-grid")).size();

    }

    public WebElement wishListElements() {
        return Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]")).get(2);
    }



    public WebElement notificationMessage() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }
    public WebElement productAddedToCart()
    {
        return  Hooks.driver.findElements(By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]")).get(2);
    }

    public WebElement shoppingCartTab()
    {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"cart-label\"]"));
    }
//    public WebElement messageOfAddTOCartDisplayed()
//    {
//        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
//    }


}
