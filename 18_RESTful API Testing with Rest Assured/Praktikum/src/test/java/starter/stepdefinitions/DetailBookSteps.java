package starter.stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.book.Detail;

public class DetailBookSteps {
    @Steps
    Detail DetailBook;

    @Given("I set method GET at api endpoints for detail book")
    public void setMethodGet() {
        DetailBook.setMethodGet("9781449325862");
    }

    @When("I send method GET HTTP request with parameter ISBN for detail book")
    public void sendMethodGet() {
        DetailBook.sendMethodGet();
    }

    @And("I receive valid HTTP response code 200 for detail book")
    public void receiveHTTPResponse() {
        DetailBook.receiveHTTPResponse();
    }

    @Then("I receive valid data for detail of book")
    public void receiveValidData() {
        DetailBook.receiveValidData();
    }
}
