package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.GetDetails;

public class GetDetailsProductSteps {
    @Steps
    GetDetails GetDetails;

    @Given("I set method GET at api endpoints for get data details product")
    public void setMethodGet() {
        GetDetails.setMethodGet();
    }

    @When("I send method GET HTTP request for get data details product")
    public void sendMethodGet() {
        GetDetails.sendMethodGet();
    }

    @And("I receive valid HTTP response code 200 for get data details product")
    public void receiveHTTPResponse() {
        GetDetails.receiveHTTPResponse();
    }

    @Then("I receive valid message about details product")
    public void receiveValidMessage() {
        GetDetails.receiveValidMessage();
    }
}
