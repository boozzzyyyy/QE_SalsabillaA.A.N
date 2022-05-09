package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Category.GetAll;

public class GetAllCategorySteps {
    @Steps
    GetAll GetAllCategory;

    @Given("I set method GET at api endpoints for get all data category")
    public void setMethodGet() {
        GetAllCategory.setMethodGet();
    }

    @When("I send method GET HTTP request for get all data category")
    public void sendMethodGet() {
        GetAllCategory.sendMethodGet();
    }

    @And("I receive valid HTTP response code 200 for get all data category")
    public void receiveHTTPResponse() {
        GetAllCategory.receiveHTTPResponse();
    }

    @Then("I receive valid message get all data category succesfully")
    public void receiveValidMessage() {
        GetAllCategory.receiveValidMessage();
    }
}
