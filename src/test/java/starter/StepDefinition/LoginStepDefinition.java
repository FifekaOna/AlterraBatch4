package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.Step.LoginSteps;

public class LoginStepDefinition {
    @Steps
    LoginSteps loginSteps;

    @Given("I already on login page")
    public void iAlreadyOnLoginPage(){
        loginSteps.openLoginPage();
    }

    @When("I input my username")
    public void inputMyUsername(){
        loginSteps.inputUsername();

    }

    @And("I input my password")
    public void inputMyPassword(){
        loginSteps.inputPassword();
    }

    @And("I click login button")
    public void clickLoginButton(){
        loginSteps.clickLoginButton();
    }

    @Then("The system show dashboard page")
    public void systemShowDashboard(){
        loginSteps.verifyDashboardPage();

    }

    @And("The system show welcome message")
    public void systemShowUserName(){

    }

    @Given("I already logged in")
    public void alreadyLoggedin(){
       loginSteps.loginInJurnal();
    }
}