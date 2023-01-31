package clarusway.tests.again;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class day02_01POM {

    public void day02_01POM() {

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="user-name")
    public WebElement   txtUsername;

    @FindBy (id="password")
    public WebElement   txtPassword;


    @FindBy (id="login-button")
    public WebElement   btnLogin;


}
