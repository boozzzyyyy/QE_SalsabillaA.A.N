package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.ProfilePage;

public class LoginSteps {
    @Steps
    LoginPage login;

    @Steps
    ProfilePage profile;

    @Given("I am on login page website")
    public void onTheLoginPage() {
        login.onTheLoginPage();
        login.openPage();
        login.validateOnLoginPage();
    }

    @When("I am input valid username")
    public void inputValidUsername() {
        login.inputValidUsername();
        login.inputUsername("testsection20");
    }

    @And("I am input valid password")
    public void inputValidPassword() {
        login.inputValidPassword();
        login.inputPassword("Testsection20!");
    }

    @And("I click button login")
    public void clickButtonLogin() {
        login.clickButtonLogin();
        login.clickLoginButton();
    }

    @Then("I am on the home page and see my username")
    public void onTheHomePageSeeUsername() {
        login.onTheHomePageSeeUsername();
        login.validateSuccessLogin();
    }
}
