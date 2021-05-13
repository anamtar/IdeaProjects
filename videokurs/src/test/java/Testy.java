import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.google.common.base.CharMatcher.is;
import static com.google.common.base.CharMatcher.compareEqualTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class Testy {

    private WebDriver driver;

    @Before // to co dzieje się przed testem
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "c:\\ChromeDriver\\chromedriver.exe"); //podajemy ścieżkę do chromeDriver (najłatwiej go mieć na C:
        driver = new ChromeDriver();   //korzystamy z przegladarki chrome
        //driver.navigate().to("http://www.wikipedia.pl");    // podajemy stronę jaką chcemy otworzyć
        driver.navigate().to("http://www.mediaexpert.pl");    // podajemy stronę jaką chcemy otworzyć
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // czeka 10 sekund bez względuna to, czy znajdzie element wcześniej czy też nie znajdzie go w tym czasie
    // NAJBARDZIEJ POLECANE ROZWIĄZANIE
        // explicitwait - w danym miejscu w kodzie justawiamy jaki czas chcemy poczekać. To nie jest zmienna globala
      //  WebDriverWait wait = new WebDriverWait(driver, 6);
       // wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(......)))   //wstawiamy explicitwaita przed akcją na danym obiekcie, musimy jednak o tym pamiętać, że jak tego potrzebujemy to muismy to zastosować

    // Jest jeszcze fluentWait

//
        // Wait<WebDriver> czekaj = new FluentWait<WebDriver>(driver)
//                .withTimeout(30, SECONDS)
//                .pollingEvery(5)
//                .ignoring(NoSuchElementException);
//    4 sposób - ale odradzane.
//        try {
//            Thread.sleep(4000);  // sleep zatrzymuje akcje na 4 sekundu, a potem przechodzi do dalszej akci
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

//    @Test //to co jest związane z testem
//    public void wikiTest() {
//
//     //   WebDriverWait wait = new WebDriverWait(driver, 6);  //nie pwoiniśmy łączyć tego rozwiązania z waitem z linie 23, to jest lepsze
//        Assert.assertEquals(driver.getTitle(), "Wikipedia, wolna encyklopedia"); //to co chemy sprawdzić. W tym wypadku chcemy sprawdzić czy wyświetla się poprawna strona
//        driver.findElement(By.linkText("O Wikipedii")).click();
//        //verifyElementPresent(driver, By.linkText("O daddsa"), "Nie został znaleziony link 'O daddsa'"); // to stosujemy metodę opracowaną poniżej, Weryfikacja nie przerywa testu
//        Assert.assertEquals(true, verifyElementPresent(driver, By.linkText("O daddsa"), "Nie został znaleziony link 'O daddsa'")); // Assercja zatrzyma wykonanie testy FALSE
//        verifyElementPresent(driver, By.linkText("O sfsdsfds"), "Nie został znaleziony link 'O sfsdsfds'"); // to stosujemy metodę opracowaną poniżej
//        //driver.findElement(By.id("searchInput")).sendKeys("Warszawa"); // wyszkanie elementu po ID a potem przesłanie textu
//        //driver.findElement(By.id("searchInput")).sendKeys("Warszawa"); // wyszkanie elementu po ID a potem przesłanie textu
//        //driver.findElement(By.cssSelector("#searchInput")).sendKeys("Warszawa");//a tu po CSSie z dodatku Chrome
//        //driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Warszawa"); // a tu wyszukujemy po x path z dodatku do Chrome
//
//    }
//
//    public static boolean verifyElementPresent(WebDriver driver, By by, String opis) // metoda zwraca prawde lub fałsz
//    {
//        try {
//            driver.findElement(by);
//            return true;    // jeżeli element zostanie znalezoiny, zwraca true
//        } catch (NoSuchElementException e) {
//            System.out.println(opis);
//            return false;
//        }
//    }
    @Test
    public void mediaExpertTest()
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Telewizory i RTV")));
        driver.findElement(By.linkText("Telewizory i RTV")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("products_list")));
        driver.findElement(By.id("TELEWIZORY")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("js-newsletter_popup"))); //komenda każąca czekać aż pojawi się popup
        driver.findElement(By.cssSelector("[data-atat='close']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("[data-atat='main-product']")));
        assertThat("Liczba ofert na stronie nie równa się 20", driver.findElements(By.cssSelector("[data-atat='main-product']")).size(), is(compareEqualTo(20)));



    }

        @After // co nalezy zrobić po zakonczeniu testu, np. zamknięcie drivera(przegladarki, screenshoty, logi itp
        public void tearDown()
        {
            driver.quit();  //zamykamy stronę
        }

    }

