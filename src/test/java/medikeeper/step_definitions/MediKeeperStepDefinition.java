package medikeeper.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import medikeeper.pages.LoginPage;
import medikeeper.utilities.ConfigurationReader;
import medikeeper.utilities.Driver;
import org.testng.Assert;

public class MediKeeperStepDefinition {

    private final LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get("https://wwwprep.medikeeper.com/accounts/v8/takehome/login/");
        Assert.assertEquals(Driver.getDriver().getTitle(), "Login");
    }

    @When("User sends username and password on MediKeeper website")
    public void userSendsUsernameAndPasswordOnMediKeeperWebsite() {
        loginPage.getUsername().sendKeys(ConfigurationReader.getProperty("username1"));
        loginPage.getPassword().sendKeys(ConfigurationReader.getProperty("password1"));

    }

    @When("User clicks submit on MediKeeper website")
    public void user_clicks_submit_on_medi_keeper_website() {
        loginPage.getSubmitButton().click();
    }


    @Then("User should be redirected to Questionnaire page")
    public void userShouldBeRedirectedToQuestionnairePage() {
        String expectedURL = "https://wwwprep.medikeeper.com/components/ha/questionnaire.aspx";
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), expectedURL);
    }
}
