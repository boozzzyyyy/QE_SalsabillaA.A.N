package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.likepost.LikePost;

public class LikePostSteps {
    @Steps
    LikePost likePost;

    @Given("I am on the timeline page")
    public void onTheTimelinePage() {
        likePost.onTheTimelinePage();
    }

    @When("I hover a like button from a post")
    public void hoverLikeButton() {
        likePost.hoverLikeButton();
    }

    @And("I choose and click an expression like post")
    public void chooseAndClickExpressionLike() {
        likePost.chooseAndClickExpressionLike();
    }

    @Then("I give a like to that post")
    public void giveALike() {
        likePost.giveALike();
    }
}
