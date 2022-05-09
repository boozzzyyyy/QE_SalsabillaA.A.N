package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Category.Create;

public class CreateCategorySteps {
    @Steps
    Create CreateCategory;

    @Given("I set method POST at api endpoints for add new category")
    public void setMethodPost() {
        CreateCategory.setMethodPost();
    }

    @When("I send method POST HTTP request for add new category")
    public void sendMethodPost() {
        CreateCategory.sendMethodPost("Pakaian");
    }

    @And("I receive valid HTTP response code 200 for add new category")
    public void receiveHTTPResponse() {
        CreateCategory.receiveHTTPResponse();
    }

    @Then("I receive valid message category created succesfully")
    public void receiveValidMessage() {
        CreateCategory.receiveValidMessage();
    }
}
