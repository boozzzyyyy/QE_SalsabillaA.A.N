package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SearchPage;

public class SearchSteps {
    private int countBeforeSearch = 0, countAfterSearch =0;
    @Steps
    SearchPage search;

    @Given("I am on book page")
    public void onBookPage() {
        search.openPage();
        search.onBookPage();
        search.validateOnBookPage();
    }

    @When("I click search field")
    public void clickSearchField() {
        search.searchFieldClick();
        search.clickSearchField();
    }

    @And("I am input keyword at search field")
    public void inputKeywordSearchField() {
        this.countBeforeSearch = search.countResultSearch();
        search.inputSearchField("pocket");
        this.countAfterSearch = search.countResultSearch();
        search.inputKeywordSearchField();
    }

    @Then("I see list book filtered by a keyword")
    public void listBookFiltered() {
        search.validateResultSearchFiltered(this.countBeforeSearch, this.countAfterSearch);
        search.listBookFiltered();
    }

}
