package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {


    @Given("I am already on log in page")
    public void IamAlreadyOnLoginPage(){

    }

    @When("I input username {string}")
    public void IInputUsername(String username ){

    }

    @And("I Input password {string}")
    public void IInputPassword(String password){

    }

    @And("I click login button")
    public void IClickLoginButton(){

    }

    @Then("I redirected to inventory page")
    public void IredirectedToInventoryPage(){

    }
}
