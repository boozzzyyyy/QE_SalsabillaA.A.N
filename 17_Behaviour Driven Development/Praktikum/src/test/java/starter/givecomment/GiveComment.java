package starter.givecomment;

import net.thucydides.core.annotations.Step;

public class GiveComment {
    @Step("I am on the timeline page")
    public void onTheTimelinePage() {
        System.out.println("I am on the timeline page");
    }

    @Step("I choose my mutual post and enter a comment")
    public void choosePost() {
        System.out.println("I choose my mutual post and enter a comment");
    }

    @Step("I click button Enter at my keyboard")
    public void clickButtonEnter() {
        System.out.println("I choose and click an expression like post");
    }

    @Step("I can see my comment posted succesfully at the bottom my mutuals post")
    public void seeCommentPosted() {
        System.out.println("I can see my comment posted succesfully at the bottom my mutuals post");
    }
}
