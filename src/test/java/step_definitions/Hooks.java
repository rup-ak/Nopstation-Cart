package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import static utilities.DriverSetup.quiteBrowser;
import static utilities.DriverSetup.setBrowser;

import java.net.MalformedURLException;

public class Hooks {
    @Before
    public void openBrowser() throws MalformedURLException{
        setBrowser();
    }

    @After
    public void closeBrowser(Scenario scenario){
        quiteBrowser(scenario);
    }
}
