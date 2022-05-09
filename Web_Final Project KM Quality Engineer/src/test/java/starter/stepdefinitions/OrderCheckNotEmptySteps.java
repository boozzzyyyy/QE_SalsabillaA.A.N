package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.HomePage;
import starter.Pages.OrderPage;

public class OrderCheckNotEmptySteps {
    @Steps
    OrderPage order;

    @Steps
    HomePage home;

    @Given("I am on home page website for order check not empty")
    public void onTheHomePage() {
        order.onTheHomePageForOrderCheckNotEmpty();
        home.openPage();
        home.validateOnTheHomePage();
    }

    @When("I click button Beli at random stuff for order check not empty")
    public void clickButtonBeli() {
        order.clickButtonBeli();
        order.clickButtonBeliForOrderCheckNotEmpty();
    }

    @And("I click icon cart for order check not empty")
    public void clickIconCart() {
        order.clickIconCart();
        order.clickIconCartForOrderCheckNotEmpty();
    }

    @And("I am on the order page for order check not empty")
    public void onTheOrderPage() {
        order.validateOnTheOrderPage();
        order.onTheOrderPageForOrderCheckNotEmpty();
    }

    @Then("I see my order is not empty for order check not empty")
    public void seeOrderIsNotEmpty() {
        order.seeOrderIsNotEmpty();
        order.validateOrderIsNotEmpty();
    }
}
