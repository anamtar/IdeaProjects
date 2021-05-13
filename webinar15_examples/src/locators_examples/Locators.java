package locators_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators extends BasePage {

//    @Test
//    public void idLocationExample()
//    {
//        WebElement logoElement = driver.findElement(By.id("_desktop_logo"));
//
//        Assert.assertTrue(logoElement.isDisplayed());
//
//    }
//
//    @Test
//    public void cssSelector()
//    {
//        WebElement cartProductCart = driver.findElement(By.cssSelector("#_desktop_cart .cart-products-count")); //wybierasz css selector a potem diva i robisz scieżkę, między divem a cssem skopiowanym musi być spacja
//        String actual = cartProductCart.getText(); // wykorzystanie CSS selektorow jest ważne w automatyzacji
//
//        Assert.assertEquals(actual, "(0)");
//    }
//
//    @Test
//    public void className()
//    {
//        WebElement cartProductCart = driver.findElement(By.className("cart-products-count"));
//        String actual = cartProductCart.getText(); // wykorzystanie CSS selektorow jest ważne w automatyzacji
//
//        Assert.assertEquals(actual, "(0)");
//    }
    //Na stronie sklepu, kliknij 'Kontakt z nami', następnie
    //wykorzustując By.tagname uzupełnij pole 'Wiadomość'
//    @Test
//    public void tagNameExample()
//    {
//        WebElement kontaktZNami = driver.findElement(By.cssSelector("a[href*='kontakt']:nth-of-type(1)"));
//        kontaktZNami.click();
//        WebElement textArea = driver.findElement(By.tagName("textarea"));
//        textArea.sendKeys("Wprowadzam jakąś wiadomość");

//    }
//
//    @Test
//    public void linkTextExample()
//    {
//        //Wykorzystując By.linkText kliknij w link 'Kontakt z nami'
//        WebElement kontaktzNami = driver.findElement(By.linkText("Kontakt z nami"));
//        kontaktzNami.click();
//
//    }

//    @Test
//    public void linkTextExample()
//    {
//        //Wykorzystując By.partialLinkText kliknij w link 'Terms and conditions'
//        //wykorzystaj jedynie część tekstu
//        WebElement kontaktzNami_partial = driver.findElement(By.partialLinkText("z nam"));
//        kontaktzNami_partial.click();
//    }

//    @Test
//    public void xpathExample() {
        // //span[contains(., 'Zaloguj się')]
        //Wykorzystanie wyszukiwania tekstu zawierającego 'Zaloguj się'
        //znak kropki oznacza, że szukamy w tekście. Możemy także szukać
        //wewnątrz dowolnego atrybutu np. contains(@class,'cart') - klasa zawiera 'cart'
        // //span[text()='Zaloguj się']
        //Tekst znacznika jest równy (podobnie jak equals) 'Zaloguj się'
        // //table[@id="table2"]//tr[td[text()='jsmith@gmail.com']]
        //Wyszukiwanie wewnątrz tabeli o id 'table2' wyszukaj taki wiersz
        //którego komórka zawiera text 'jsmith@gmail.com'
        //Zwróć uwagę na konstrukcję tag[tag2[warunki]]
//    }

    @Test
    public void zadanieZGwiazką()
    {
       // *Zadanie z gwiazdką - na Stronie http://the-internet.herokuapp.com/ przejdź do 'Sortable data tables',
        // upewnij się, że jesteś na poprawnej stronie. W tabeli pierwszej policz wszystkich użytkowników,
        // którzy mają zadłużenie > 100$. W tabeli 2 policz wszystkich, którzy mają zadłużenie <=50$.

        WebElement sortableDataTables = driver.findElement(By.linkText("Sortable Data Tables"));
        sortableDataTables.click();
        String sortableDataTablesLink = driver.getCurrentUrl();

        Assert.assertEquals(sortableDataTablesLink, "http://the-internet.herokuapp.com/tables");

        WebElement kalkulacja = driver.findElement(By.xpath("//table[@id='table2']//tbody//[td[text()='jsmith@gmail.com']]"));

        String porownanie = kalkulacja.getText();

        Assert.assertEquals(porownanie, "jsmith@gmail.com");

        //wewnątrz dowolnego atrybutu np. contains(@class,'cart') - klasa zawiera 'cart'
        // //span[text()='Zaloguj się']
        //Tekst znacznika jest równy (podobnie jak equals) 'Zaloguj się'
        // //table[@id="table2"]//tr[td[text()='jsmith@gmail.com']]
        //Wyszukiwanie wewnątrz tabeli o id 'table2' wyszukaj taki wiersz
        //którego komórka zawiera text 'jsmith@gmail.com'
        //Zwróć uwagę na konstrukcję tag[tag2[warunki]]




    }


}
