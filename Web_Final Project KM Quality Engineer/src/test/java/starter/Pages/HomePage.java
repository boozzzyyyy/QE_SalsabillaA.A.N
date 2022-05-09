package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By searchCategoryField() {
        return By.className("v-input__slot");
    }

    @Step
    public void openPage(){
        open("open");
    }

    @Step
    public boolean validateOnTheHomePage(){
        return $(searchCategoryField()).isDisplayed();
    }

    @Step
    public void inputSearchCategory(String search){
        $(searchCategoryField()).type(search);
    }

}
