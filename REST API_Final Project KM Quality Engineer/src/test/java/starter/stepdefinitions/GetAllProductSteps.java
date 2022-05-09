package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.GetAll;

public class GetAllProductSteps {
    @Steps
    GetAll GetAllProduct;

    @Given("I set method GET at api endpoints for get all data product")
    public void setMethodGet() {
        GetAllProduct.setMethodGet();
    }

    @When("I send method GET HTTP request for get all data product")
    public void sendMethodGet() {
        GetAllProduct.sendMethodGet();
    }

    @And("I receive valid HTTP response code 200 for get all data product")
    public void receiveHTTPResponse() {
        GetAllProduct.receiveHTTPResponse();
    }

    @Then("I receive valid message get all data product succesfully")
    public void receiveValidMessage() {
        GetAllProduct.receiveValidMessage();
    }
}
