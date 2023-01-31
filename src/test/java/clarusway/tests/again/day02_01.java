package clarusway.tests.again;

import clarusway.pages.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class day02_01 {
    @Test
    public void test() {

        SauceDemoLoginPage loginPage = new SauceDemoLoginPage();



        loginPage.txtUsername.sendKeys("standard_user");



        loginPage.txtPassword.sendKeys("secret_sauce");


        loginPage.btnLogin.click();


    }
}
