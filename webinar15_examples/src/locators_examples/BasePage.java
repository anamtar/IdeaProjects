package locators_examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver; // tutaj, żeby każda klasa miała dostęp

    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();    // określenie drivera - w tym wypadku Firefox
        //driver.get("http://sampleshop.inqa.pl/"); //otworzenie strony
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize(); // maksymalizacja okna
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); //automatyczne czekanie na elementy
    }

    @BeforeMethod
    public void methodSetup() {
        System.out.println("Uruchamiam kolejną metodę");
    }

    @AfterClass
    public void tearDown() {

        //driver.quit(); // wyjście i zamknięcie strony
    }
    //Podobnie jak BeforeClass uruchamianie przy każdej klasie testowej
    //W tym wypadku na jej końcu. Zapewnia zamknięcie okna przeglądarki
    //po testach
}

