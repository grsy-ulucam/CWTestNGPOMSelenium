package clarusway.tests;




import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import org.testng.annotations.Test;
import clarusway.utilities.Driver;


public class Day01_C01_DriverExample {



    @Test

    public void test(){



        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");



        String title = Driver.getDriver().getTitle();



        Assert.assertTrue(title.contains("OrangeHRM"));



        Driver.closeDriver();







    }



    @Test

    public void test02(){



        WebDriver driver = Driver.getDriver();



        driver.get("https://opensource-demo.orangehrmlive.com/");



        String title = driver.getTitle();



        Assert.assertTrue(title.contains("OrangeHRM"));



        Driver.closeDriver();



    }







}



