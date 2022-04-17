package starter.pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchPage extends PageObject {

    private By searchField() {
        return By.id("searchBox");
    }

    @Step
    public void openPage(){
        open("open.books");
    }

    @Step
    public boolean validateOnBookPage(){
        return $(searchField()).isDisplayed();
    }

    @Step
    public void searchFieldClick(){
        $(searchField()).click();
    }

    @Step
    public void inputSearchField(String search){
        $(searchField()).type(search);
    }

    @Step
    public int countResultSearch(){
        return findAll("div[role='rowgroup']").size();
    }

    @Step
    public boolean validateResultSearchFiltered(int before, int after){
        return (after < before);
    }

    @Step("I am on book page")
    public void onBookPage() {
        System.out.println("I am on book page");
    }

    @Step("I click search field")
    public void clickSearchField() {
        System.out.println("I click search field");
    }

    @Step("I am input keyword at search field")
    public void inputKeywordSearchField() {
        System.out.println("I am input keyword at search field");
    }

    @Step("I see list book filtered by a keyword")
    public void listBookFiltered() {
        System.out.println("I see list book filtered by a keyword");
    }

}
