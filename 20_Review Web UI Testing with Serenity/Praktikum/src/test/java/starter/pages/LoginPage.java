package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    private By usernameField() {
        return By.id("userName");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By loginButton(){
        return By.id("login");
    }

    private By labelUsernameLogin(){
        return By.id("userName-value");
    }

    @Step
    public void openPage(){
        open("open.login");
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputUsername(String username){
        $(usernameField()).type(username);
    }

    @Step
    public void inputPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean validateSuccessLogin(){
        return $(labelUsernameLogin()).isDisplayed();
    }

    @Step("I am on login page website")
    public void onTheLoginPage() {
        System.out.println("I am on login page website");
    }

    @Step("I am input valid username")
    public void inputValidUsername() {
        System.out.println("I am input valid username");
    }

    @Step("I am input valid password")
    public void inputValidPassword() {
        System.out.println("I am input valid password");
    }

    @Step("I click button login")
    public void clickButtonLogin() {
        System.out.println("I click button login");
    }

    @Step("I am on the profile page")
    public void onTheProfilePage() {
        System.out.println("I am on the profile page");
    }

    @Step("I am on the home page and see my username")
    public void onTheHomePageSeeUsername() {
        System.out.println("I am on the home page and see my username");
    }

    @Step("I am back to login page website")
    public void backToLoginPage() {
        System.out.println("I am back to login page website");
    }
}
