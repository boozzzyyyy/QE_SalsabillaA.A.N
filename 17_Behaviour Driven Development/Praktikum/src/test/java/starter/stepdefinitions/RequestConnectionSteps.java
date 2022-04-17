package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.requestconnection.RequestConnection;

public class RequestConnectionSteps {
    @Steps
    RequestConnection requestConnection;

    @Given("I am on the my network page")
    public void onMyNetworkPage() {
        requestConnection.onMyNetworkPage();
    }

    @When("I choose a people from suggestion panel")
    public void choosePeople() {
        requestConnection.choosePeople();
    }

    @And("I click button connect")
    public void clickButtonConnect() {
        requestConnection.clickButtonConnect();
    }

    @Then("I can see the button succesfully change to requested")
    public void seeButtonRequested() {
        requestConnection.seeButtonRequested();
    }
}
