package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.uploadpost.UploadPost;

public class UploadPostSteps {
    @Steps
    UploadPost uploadPost;

    @Given("I am on the timeline page")
    public void onTheTimelinePage() {
        uploadPost.onTheTimelinePage();
    }

    @When("I enter what im interest at my post")
    public void enterPost() {
        uploadPost.enterPost();
    }

    @And("I click button posting")
    public void clickButtonPosting() {
        uploadPost.clickButtonPosting();
    }

    @Then("I can see my post succesfully show at my timeline page")
    public void seeUploadedPost() {
        uploadPost.seeUploadedPost();
    }
}
