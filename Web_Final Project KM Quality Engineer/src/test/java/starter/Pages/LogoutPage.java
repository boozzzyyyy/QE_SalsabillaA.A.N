package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By iconUser() {
        return By.linkText("<i aria-hidden=\"true\" class=\"v-icon notranslate fas fa-user theme--dark\"></i>");
    }

    private By logoutButton() {
        return By.linkText("<div class=\"v-list-item__title\"> Logout </div>");
    }

    @Step
    public void clickIconUser(){
        $(iconUser()).click();
    }

    @Step
    public void clickLogoutButton(){
        $(logoutButton()).click();
    }

    @Step("I am on login page website for logout")
    public void onTheLoginPageForLogout() {
        System.out.println("I am on login page website for logout");
    }

    @Step("I am input valid email for logout")
    public void inputValidEmail() {
        System.out.println("I am input valid email for logout");
    }

    @Step("I am input valid password for logout")
    public void inputValidPassword() {
        System.out.println("I am input valid password for logout");
    }

    @Step("I click button login for logout")
    public void clickButtonLogin() {
        System.out.println("I click button login for logout");
    }

    @Step("I am on the home page for logout")
    public void onTheHomePageForLogout() {
        System.out.println("I am on the home page for logout");
    }

    @Step("I click icon user for logout")
    public void clickIconUserForLogout() {
        System.out.println("I click icon user for logout");
    }

    @Step("I click button logout for logout")
    public void clickLogoutButtonForLogout() {
        System.out.println("I click button logout for logout");
    }

    @Step("I am on login page after successfully logout for logout")
    public void onTheHomePageSuccessfullyLogoutForLogout() {
        System.out.println("I am on login page after successfully logout for logout");
    }
}
