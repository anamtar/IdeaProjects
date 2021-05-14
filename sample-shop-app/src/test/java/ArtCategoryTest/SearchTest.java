package ArtCategoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SearchTest {

    @Test
    public void searchBrownBear(){
        WebElement driver = new FirefoxDriver;
        driver.get("http://sampleshop.inqa.pl/");
        Assert.assertEquals(driver.getTitle(), "xyz");
    }
}
