package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailField() {
        return By.id("input-57");
    }
    private By passwordField() {
        return By.id("input-60");
    }
    private By loginButton() {
        return By.linkText("<span class=\"v-btn__content\">Login</span>");
    }

    @Step
    public void openPage(){
        open("open.auth.login");
    }

    @Step
    public boolean validateOnTheLoginPage(){
        return $(loginButton()).isDisplayed();
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
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step("I am on login page website for login")
    public void onTheLoginPage() {
        System.out.println("I am on login page website for login");
    }

    @Step("I am input valid email for login")
    public void inputValidEmail() {
        System.out.println("I am input valid email for login");
    }

    @Step("I am input valid password for login")
    public void inputValidPassword() {
        System.out.println("I am input valid password for login");
    }

    @Step("I click button login for login")
    public void clickButtonLogin() {
        System.out.println("I click button login for login");
    }

    @Step("I am on the home page for login")
    public void onTheHomePageForLogin() {
        System.out.println("I am on the home page for login");
    }
}
