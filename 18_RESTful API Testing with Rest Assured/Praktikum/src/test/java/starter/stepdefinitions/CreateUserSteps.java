package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Create;

public class CreateUserSteps {
    @Steps
    Create CreateUser;

    @Given("I set method POST at api endpoints for create user")
    public void setMethodPost() {
        CreateUser.setMethodPost();
    }

    @When("I send method POST HTTP request for create user")
    public void sendMethodPost() {
        CreateUser.sendMethodPost("salsabillaaan", "!Salsabilla190600");
    }

    @And("I receive valid HTTP response code 201 for create user")
    public void receiveHTTPResponse() {
        CreateUser.receiveHTTPResponse();
    }

    @Then("I receive valid message user created succesfully")
    public void receiveValidMessage() {
        CreateUser.receiveValidMessage();
    }
}
