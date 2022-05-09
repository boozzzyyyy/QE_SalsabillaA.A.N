package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.LoginPage;
import starter.Pages.HomePage;

public class LoginSteps {
    @Steps
    LoginPage login;

    @Steps
    HomePage home;

    @Given("I am on login page website for login")
    public void onTheLoginPage() {
        login.onTheLoginPage();
        login.openPage();
        login.validateOnTheLoginPage();
    }

    @When("I am input valid email for login")
    public void inputValidEmail() {
        login.inputValidEmail();
        login.inputEmail("salsabillanugraha10@gmail.com");
    }

    @And("I am input valid password for login")
    public void inputValidPassword() {
        login.inputValidPassword();
        login.inputPassword("salsacantik");
    }

    @And("I click button login for login")
    public void clickButtonLogin() {
        login.clickButtonLogin();
        login.clickLoginButton();
    }

    @Then("I am on the home page for login")
    public void onTheHomePageForLogin() {
        login.onTheHomePageForLogin();
        home.validateOnTheHomePage();
    }
}
