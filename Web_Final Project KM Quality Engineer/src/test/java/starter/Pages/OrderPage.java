package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By iconCart() {
        return By.linkText("<i aria-hidden=\"true\" class=\"v-icon notranslate fas fa-shopping-cart theme--dark\"></i>");
    }
    private By orderIsEmptyLabel() {
        return By.linkText("<div class=\"v-alert__content\"> Order is empty! </div>");
    }
    private By buttonBeli() {
        return By.linkText("<button type=\"button\" class=\"button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text\"><span class=\"v-btn__content\">Beli</span></button>");
    }

    @Step
    public void openPage(){
        open("open.order");
    }

    @Step
    public boolean validateOnTheOrderPage(){
        return $(orderIsEmptyLabel()).isDisplayed();
    }

    @Step
    public boolean validateOrderIsEmpty(){
        return $(orderIsEmptyLabel()).isDisplayed();
    }

    @Step
    public boolean validateOrderIsNotEmpty(){
        return !$(orderIsEmptyLabel()).isDisplayed();
    }

    @Step
    public void clickIconCart(){
        $(iconCart()).click();
    }

    @Step
    public void clickButtonBeli(){
        $(buttonBeli()).click();
    }

    @Step("I am on home page website for order check empty")
    public void onTheHomePageForOrderCheckEmpty() {
        System.out.println("I am on home page website for order check empty");
    }

    @Step("I click icon cart for order check empty")
    public void clickIconCartForOrderCheckEmpty() {
        System.out.println("I click icon cart for order check empty");
    }

    @Step("I am on the order page for order check empty")
    public void onTheOrderPageForOrderCheckEmpty() {
        System.out.println("I am on the order page for order check empty");
    }

    @Step("I see my order is empty for order check empty")
    public void seeOrderIsEmpty() {
        System.out.println("I am on the order page for order check empty");
    }

    //------------------------------------------------------------------------------------------------------------------
    @Step("I am on home page website for order check not empty")
    public void onTheHomePageForOrderCheckNotEmpty() {
        System.out.println("I am on home page website for order check not empty");
    }

    @Step("I click button Beli at random stuff for order check not empty")
    public void clickButtonBeliForOrderCheckNotEmpty() {
        System.out.println("I click button Beli at random stuff for order check not empty");
    }

    @Step("I click icon cart for order check not empty")
    public void clickIconCartForOrderCheckNotEmpty() {
        System.out.println("I click icon cart for order check not empty");
    }

    @Step("I am on the order page for order check not empty")
    public void onTheOrderPageForOrderCheckNotEmpty() {
        System.out.println("I am on the order page for order check not empty");
    }

    @Step("I see my order is not empty for order check not empty")
    public void seeOrderIsNotEmpty() {
        System.out.println("I see my order is not empty for order check not empty");
    }
}
