package starter.likepost;

import net.thucydides.core.annotations.Step;

public class LikePost {
    @Step("I am on the timeline page")
    public void onTheTimelinePage() {
        System.out.println("I am on the timeline page");
    }

    @Step("I hover a like button from a post")
    public void hoverLikeButton() {
        System.out.println("I hover a like button from a post");
    }

    @Step("I choose and click an expression like post")
    public void chooseAndClickExpressionLike() {
        System.out.println("I choose and click an expression like post");
    }

    @Step("I give a like to that post")
    public void giveALike() {
        System.out.println("I give a like to that post");
    }
}
