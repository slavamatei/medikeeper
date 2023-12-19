package medikeeper.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import medikeeper.utilities.Driver;

public class Hooks {

    @After
    public void TearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshotAs = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotAs, "image/png", scenario.getName());
        }
        Driver.closeDriver();
    }
}
