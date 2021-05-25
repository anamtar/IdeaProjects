package locators_examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators extends BasePage {
    @Test
    public void idLocationExample(){
        WebElement logoElement = driver.findElement(By.id("_desktop_logo"));

        Assert.assertTrue(logoElement.isDisplayed());
    }

    @Test
    public void cssSelectorExample(){
        WebElement cartProductsCount = driver.findElement(By.cssSelector("#_desktop_cart .cart-products-count"));
        //*[@id='_desktop_cart']//*[@class='cart-products-count']
        String actualCount = cartProductsCount.getText();

        Assert.assertEquals(actualCount, "(0)");
    }

    @Test
    public void classNameExample(){
        WebElement cartProductsCount = driver.findElement(By.className("cart-products-count"));
        String actualCount = cartProductsCount.getText();

        Assert.assertEquals(actualCount, "(0)");
    }

    @Test
    public void xpathExample(){
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


    }

    @Test
    public void tagNameExample(){
        //Na stronie sklepu, kliknij 'Kontakt z nami', następnie
        //wykorzustując By.tagname uzupełnij pole 'Wiadomość'

    }

    @Test
    public void linkTextExample(){
        //Wykorzystując By.linkText kliknij w link 'Kontakt z nami'
    }

    @Test
    public void partialLinkTextExample(){
        //Wykorzystując By.partialLinkText kliknij w link 'Terms and conditions'
        //wykorzystaj jedynie część tekstu
    }
}