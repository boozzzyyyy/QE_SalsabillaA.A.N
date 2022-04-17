package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.givecomment.GiveComment;

public class GiveCommentSteps {
    @Steps
    GiveComment giveComment;

    @Given("I am on the timeline page")
    public void onTheTimelinePage() {
        giveComment.onTheTimelinePage();
    }

    @When("I choose my mutual post and enter a comment")
    public void choosePost() {
        giveComment.choosePost();
    }

    @And("I click button Enter at my keyboard")
    public void clickButtonEnter() {
        giveComment.clickButtonEnter();
    }

    @Then("I can see my comment posted succesfully at the bottom my mutuals post")
    public void seeCommentPosted() {
        giveComment.seeCommentPosted();
    }
}
