package webelements_ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://sampleshop.inqa.pl/"); //otworzenie strony
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //automatyczne czekanie na elementy
    }

    @BeforeMethod
    public void methodSetup(){
        System.out.println("Uruchamiam kolejną metodę");
    }

    @AfterClass
    public void tearDown(){

        driver.quit();

    }
}
