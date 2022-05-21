package test.alta.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.alta.pageobject.BasePageObject;

public class LoginScreen extends BasePageObject {
    private By loginIcon() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }

    private By emailField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");
    }

    private By passwordField() {
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");
    }

    private By loginButton() {
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    }

    private By textProductHomePage() {
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }

    @Step
    public boolean isOnHomePage() {
        return waitUntilVisible(textProductHomePage()).isDisplayed();
    }

    @Step
    public boolean isOnLoginPage() {
        return waitUntilVisible(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email) {
        onClick(emailField());
        onType(emailField(), email);
    }

    @Step
    public void inputPassword(String password) {
        onClick(passwordField());
        onType(passwordField(), password);
    }

    @Step
    public void clickIconLogin() {
        onClick(loginIcon());
    }

    @Step
    public void clickLoginButton() {
        onClick(loginButton());
    }
}
