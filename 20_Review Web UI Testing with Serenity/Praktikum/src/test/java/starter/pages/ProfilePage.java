package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProfilePage extends PageObject {
    private By title(){
        return By.className("main-header");
    }

    @Step
    public void validateOnProfilePage(){
        $(title()).isDisplayed();
    }

}
