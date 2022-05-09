package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.LogoutPage;
import starter.Pages.LoginPage;
import starter.Pages.HomePage;

public class LogoutSteps {
    @Steps
    LoginPage login;

    @Steps
    LogoutPage logout;

    @Steps
    HomePage home;

    @Given("I am on login page website for logout")
    public void onTheLoginPageForLogout() {
        logout.onTheLoginPageForLogout();
        login.openPage();
        login.validateOnTheLoginPage();
    }

    @When("I am input valid email for logout")
    public void inputValidEmail() {
        logout.inputValidEmail();
        login.inputEmail("salsabillanugraha10@gmail.com");
    }

    @And("I am input valid password for logout")
    public void inputValidPassword() {
        logout.inputValidPassword();
        login.inputPassword("salsacantik");
    }

    @And("I click button login for logout")
    public void clickButtonLogin() {
        logout.clickButtonLogin();
        login.clickLoginButton();
    }

    @And("I am on the home page for logout")
    public void onTheHomePageForLogout() {
        logout.onTheHomePageForLogout();
        home.validateOnTheHomePage();
    }

    @And("I click icon user for logout")
    public void clickIconUserForLogout() {
        logout.clickIconUserForLogout();
        logout.clickIconUser();
    }

    @And("I click button logout for logout")
    public void clickLogoutButtonForLogout() {
        logout.clickLogoutButtonForLogout();
        logout.clickLogoutButton();
    }

    @Then("I am on login page after successfully logout for logout")
    public void onTheHomePageSuccessfullyLogoutForLogout() {
        logout.onTheHomePageSuccessfullyLogoutForLogout();
        login.validateOnTheLoginPage();
    }
}
