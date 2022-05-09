package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    private By fullNameField() {
        return By.id("input-18");
    }
    private By emailField() {
        return By.id("input-21");
    }
    private By passwordField() {
        return By.id("input-24");
    }
    private By registerButton() {
        return By.linkText("<span class=\"v-btn__content\">Register</span>");
    }

    @Step
    public void openPage(){
        open("open.auth.register");
    }

    @Step
    public boolean validateOnRegisterPage(){
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputFullname(String fullname){
        $(fullNameField()).type(fullname);
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickRegisterButton(){
        $(registerButton()).click();
    }

    @Step("I am on register page website for register")
    public void onTheRegisterPage() {
        System.out.println("I am on register page website for register");
    }

    @Step("I am input valid full name for register")
    public void inputValidFullname() {
        System.out.println("I am input valid full name for register");
    }

    @Step("I am input valid email for register")
    public void inputValidEmail() {
        System.out.println("I am input valid email for register");
    }

    @Step("I am input valid password for register")
    public void inputValidPassword() {
        System.out.println("I am input valid password for register");
    }

    @Step("I click button register for register")
    public void clickButtonRegister() {
        System.out.println("I click button register for register");
    }

    @Step("I am on the login page for register")
    public void onTheLoginPageForRegister() {
        System.out.println("I am on the login page for register");
    }
}
