package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;
import starter.pages.ProfilePage;

public class LogoutSteps {
    @Steps
    LoginPage login;

    @Steps
    ProfilePage profile;

    @Steps
    LogoutPage logout;

    @Given("I am on login page website \\(Logout)")
    public void onTheLoginPage() {
        login.onTheLoginPage();
        login.openPage();
        login.validateOnLoginPage();
    }

    @When("I am input valid username \\(Logout)")
    public void inputValidUsername() {
        login.inputValidUsername();
        login.inputUsername("testsection20");
    }

    @And("I am input valid password \\(Logout)")
    public void inputValidPassword() {
        login.inputValidPassword();
        login.inputPassword("Testsection20!");
    }

    @And("I click button login \\(Logout)")
    public void clickButtonLogin() {
        login.clickButtonLogin();
        login.clickLoginButton();
    }

    @And("I am on the profile page \\(Logout)")
    public void onTheProfilePage() {
        login.onTheProfilePage();
        profile.validateOnProfilePage();
    }

    @And("I click button logout")
    public void clickButtonLogout() {
        logout.clickButtonLogout();
        logout.clickLogoutButton();
    }

    @Then("I am back to login page website")
    public void backToLoginPage() {
        login.backToLoginPage();
        login.validateOnLoginPage();
    }

}
