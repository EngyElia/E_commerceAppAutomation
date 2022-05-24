package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Hooks {

    public static WebDriver driver = null;


    @Before
    public static void openBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
    }

    @After
    public static  void closeBrowser() throws InterruptedException {
       Thread.sleep(5000);
        driver.quit();

    }
}
