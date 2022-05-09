package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Product.Create;

public class CreateProductSteps {
    @Steps
    Create CreateProduct;

    @Given("I set method POST at api endpoints for add new product")
    public void setMethodPost() {
        CreateProduct.setMethodPost();
    }

    @When("I send method POST HTTP request for add new product")
    public void sendMethodPost() {
        CreateProduct.sendMethodPost("Stetoskop", 50000, 3, 6);
    }

    @And("I receive valid HTTP response code 200 for add new product")
    public void receiveHTTPResponse() {
        CreateProduct.receiveHTTPResponse();
    }

    @Then("I receive valid message product created succesfully")
    public void receiveValidMessage() {
        CreateProduct.receiveValidMessage();
    }
}
