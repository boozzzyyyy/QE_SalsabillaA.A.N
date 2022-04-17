package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;
import starter.pages.ProfilePage;

public class ProfileSteps {
    @Steps
    LoginPage login;

    @Steps
    ProfilePage profile;

    @Steps
    LogoutPage logout;

    @Given("I am on login page website \\(Profile)")
    public void onTheLoginPage() {
        login.onTheLoginPage();
        login.openPage();
        login.validateOnLoginPage();
    }

    @When("I am input valid username \\(Profile)")
    public void inputValidUsername() {
        login.inputValidUsername();
        login.inputUsername("testsection20");
    }

    @And("I am input valid password \\(Profile)")
    public void inputValidPassword() {
        login.inputValidPassword();
        login.inputPassword("Testsection20!");
    }

    @And("I click button login \\(Profile)")
    public void clickButtonLogin() {
        login.clickButtonLogin();
        login.clickLoginButton();
    }

    @Then("I am on the profile page")
    public void onTheProfilePage() {
        login.onTheProfilePage();
        profile.validateOnProfilePage();
    }
}
