package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.HomePage;
import starter.Pages.OrderPage;

public class OrderCheckEmptySteps {
    @Steps
    OrderPage order;

    @Steps
    HomePage home;

    @Given("I am on home page website for order check empty")
    public void onTheHomePage() {
        order.onTheHomePageForOrderCheckEmpty();
        home.openPage();
        home.validateOnTheHomePage();
    }

    @When("I click icon cart for order check empty")
    public void clickIconCart() {
        order.clickIconCart();
        order.clickIconCartForOrderCheckEmpty();
    }

    @And("I am on the order page for order check empty")
    public void onTheOrderPage() {
        order.validateOnTheOrderPage();
        order.onTheOrderPageForOrderCheckEmpty();
    }

    @Then("I see my order is empty for order check empty")
    public void seeOrderIsEmpty() {
        order.seeOrderIsEmpty();
        order.validateOrderIsEmpty();
    }
}
