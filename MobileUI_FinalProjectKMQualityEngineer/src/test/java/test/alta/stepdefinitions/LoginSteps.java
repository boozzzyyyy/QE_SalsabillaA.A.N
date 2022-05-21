package test.alta.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.alta.pages.LoginScreen;

public class LoginSteps {

    @Steps
    LoginScreen loginScreen;

    @Given("User on the home page for login")
    public void onTheHomePage() {
        Assert.assertTrue(loginScreen.isOnHomePage());
    }

    @When("User click icon login for login")
    public void clickIconLogin() {
        loginScreen.clickIconLogin();
    }

    @And("User on the login page for login")
    public void onTheLoginPage() {
        Assert.assertTrue(loginScreen.isOnLoginPage());
    }

    @And("User input {string} on email field for login")
    public void inputValidEmail(String email) {
        loginScreen.inputEmail(email);
    }

    @And("User input {string} on password field for login")
    public void inputValidPassword(String password) {
        loginScreen.inputPassword(password);
    }

    @And("User click login button for login")
    public void clickLoginButton() {
        loginScreen.clickLoginButton();
    }

    @Then("User success login for login")
    public void successLogin() {
        Assert.assertTrue(loginScreen.isOnHomePage());
    }
}
