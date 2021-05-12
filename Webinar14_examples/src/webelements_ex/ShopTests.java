package webelements_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopTests extends BasePage {

    @Test
    public void openHomePage(){

    }

    @Test
    public void checkHomePageUrl(){

        String pageUrl = driver.getCurrentUrl();
        Assert.assertEquals(pageUrl, "http://sampleshop.inqa.pl/" );

    }

}
