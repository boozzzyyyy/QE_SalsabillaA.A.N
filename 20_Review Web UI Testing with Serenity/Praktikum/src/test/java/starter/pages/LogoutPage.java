package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {

    private By logoutButton(){
        return By.linkText("Log out");
    }

    @Step
    public void clickLogoutButton(){
        $(logoutButton()).click();
    }

    @Step("I click button logout")
    public void clickButtonLogout() {
        System.out.println("I click button logout");
    }
}
