package starter.stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import starter.book.List;

public class ListBookSteps {
    @Steps
    List ListBook;

    @Given("I set method GET at api endpoints")
    public void setMethodGet() {
        ListBook.setMethodGet();
    }

    @When("I send method GET HTTP request")
    public void sendMethodGet() {
        ListBook.sendMethodGet();
    }

    @And("I receive valid HTTP response code 200")
    public void receiveHTTPResponse() {
        ListBook.receiveHTTPResponse();
    }

    @Then("I receive valid data for list of book")
    public void receiveValidData() {
        ListBook.receiveValidData();
    }
}
