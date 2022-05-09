package starter.stepdefinitions;

import java.util.Date;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Pages.LoginPage;
import starter.Pages.RegisterPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterSteps {
    @Steps
    LoginPage login;

    @Steps
    RegisterPage register;

    @Given("I am on register page website for register")
    public void onTheRegisterPage() {
        register.onTheRegisterPage();
        register.openPage();
        register.validateOnRegisterPage();
    }

    @When("I am input valid full name for register")
    public void inputValidFullname() {
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        Date date = new Date();

        register.inputValidFullname();
        register.inputFullname("Test Email " + formatter.format(date));
    }

    @And("I am input valid email for register")
    public void inputValidEmail() {
        SimpleDateFormat formatter = new SimpleDateFormat("HHmmss");
        Date date = new Date();

        register.inputValidEmail();
        register.inputEmail("salsabilla_testemail" + formatter.format(date) + "@gmail.com");
    }

    @And("I am input valid password for register")
    public void inputValidPassword() {
        register.inputValidPassword();
        register.inputPassword("1234567890");
    }

    @And("I click button register for register")
    public void clickButtonRegister() {
        register.clickButtonRegister();
        register.clickRegisterButton();
    }

    @Then("I am on the login page for register")
    public void onTheLoginPageForRegister() {
        register.onTheLoginPageForRegister();
        login.validateOnTheLoginPage();
    }
}
