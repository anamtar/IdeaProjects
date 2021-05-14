package explicityWait;

import com.sun.deploy.cache.BaseLocalApplicationProperties;
import locators_examples.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicityWait_examples extends BasePage {

    @Test
    public void loaderTest()
    {

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement startbutton = driver.findElement(By.cssSelector("#start button"));
        startbutton.click();

        WebElement finishElement = driver.findElement(By.cssSelector("#finish"));
        wait.until(ExpectedConditions.visibilityOf(finishElement));

        WebElement finishTextElement = driver.findElement(By.cssSelector("#finish h4"));
        String finishText = finishTextElement.getText();

        Assert.assertEquals(finishText, "Hello World!");



    }
}
