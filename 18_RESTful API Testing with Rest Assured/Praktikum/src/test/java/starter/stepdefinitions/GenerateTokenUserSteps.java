package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.GenerateToken;

public class GenerateTokenUserSteps {
    @Steps
    GenerateToken GenerateToken;

    @Given("I set method POST at api endpoints for generate token user")
    public void setMethodPost() {
        GenerateToken.setMethodPost();
    }

    @When("I send method POST HTTP request for generate token user")
    public void sendMethodPost() {
        GenerateToken.sendMethodPost("salsabillaaan", "!Salsabilla190600");
    }

    @And("I receive valid HTTP response code 201 for generate token user")
    public void receiveHTTPResponse() {
        GenerateToken.receiveHTTPResponse();
    }

    @Then("I receive valid message token created succesfully for user")
    public void receiveValidMessage() {
        GenerateToken.receiveValidMessage();
    }
}
