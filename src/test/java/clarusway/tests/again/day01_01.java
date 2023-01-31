package clarusway.tests.again;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day01_01 {


    @Test
    public void test() {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");

        String title=Driver.getDriver().getTitle();

        Assert.assertTrue(title.contains("OrangeHRM"));

        Driver.closeDriver();

    }




}
