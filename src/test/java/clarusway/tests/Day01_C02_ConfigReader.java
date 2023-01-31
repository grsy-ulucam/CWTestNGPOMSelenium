package clarusway.tests;

import org.testng.annotations.Test;
import clarusway.utilities.ConfigReader;
import clarusway.utilities.Driver;

public class Day01_C02_ConfigReader {

    @Test

    public void readConfig(){



        Driver.getDriver().get(ConfigReader.getProperty("google_url"));



        Driver.closeDriver();



    }

}
