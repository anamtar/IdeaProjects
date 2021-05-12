package webelements_ex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoryTest extends BasePage {

    @Test
    public void openMenClothesCategory()
    {
        System.setProperty("webdriver.gecko.driver","C:\\selenium_libs\\32\\geckodriver.exe");
        WebElement clothesCategoryElement = driver.findElement(By.xpath("//header/div[2]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]"));
        Actions action = new Actions(driver);
        action.moveToElement(clothesCategoryElement).pause(200).moveToElement(driver.findElement(By.cssSelector("#category-4"))).click().pause(2000);

        driver.findElement(By.cssSelector("body.lang-pl.country-pl.currency-pln.layout-left-column.page-category.tax-display-enabled.category-id-4.category-men.category-id-parent-3.category-depth-level-3:nth-child(2) div.container nav.breadcrumb.hidden-sm-down ol:nth-child(1) li:nth-child(3) > span:nth-child(1)"));

        String pageTitle = driver.getTitle();
//        action.pause(2000).build().perform();
        Assert.assertEquals(pageTitle, "Men");

    }
}
