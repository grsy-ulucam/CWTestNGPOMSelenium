package clarusway.tests.homework;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import clarusway.utilities.Driver;

import java.time.Duration;

public class Deneme {
    @Test
    public void test1() {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.n11.com/");

        SearchContext sc = driver.findElement(By.cssSelector(".efilli-layout-n11")).getShadowRoot();
        WebElement acceptAll = sc.findElement(By.cssSelector(".banner__accept-button"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions actions = new Actions(driver);
        actions.click(wait.until(ExpectedConditions.elementToBeClickable(acceptAll)))
                .perform();
        driver.close();

    }


}