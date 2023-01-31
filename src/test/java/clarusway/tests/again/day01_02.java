package clarusway.tests.again;

import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class day01_02 {


    @Test
    public void test() {

        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

        Driver.closeDriver();


    }
}
