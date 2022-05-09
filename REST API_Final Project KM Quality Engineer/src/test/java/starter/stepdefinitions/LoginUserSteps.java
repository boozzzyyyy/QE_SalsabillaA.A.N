package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.User.Login;

public class LoginUserSteps {
    @Steps
    Login LoginUser;

    @Given("I set method POST at api endpoints for login user")
    public void setMethodPost() {
        LoginUser.setMethodPost();
    }

    @When("I send method POST HTTP request for login user")
    public void sendMethodPost() {
        LoginUser.sendMethodPost("salsabillanugraha10@gmail.com", "salsacantik");
    }

    @And("I receive valid HTTP response code 200 for login user")
    public void receiveHTTPResponse() {
        LoginUser.receiveHTTPResponse();
    }

    @Then("I receive valid message login user succesfully")
    public void receiveValidMessage() {
        LoginUser.receiveValidMessage();
    }
}
