package starter.uploadpost;

import net.thucydides.core.annotations.Step;

public class UploadPost {
    @Step("I am on the timeline page")
    public void onTheTimelinePage() {
        System.out.println("I am on the timeline page");
    }

    @Step("I enter what im interest at my post")
    public void enterPost() {
        System.out.println("I enter what im interest at my post");
    }

    @Step("I click button posting")
    public void clickButtonPosting() {
        System.out.println("I click button posting");
    }

    @Step("I can see my post succesfully show at my timeline page")
    public void seeUploadedPost() {
        System.out.println("I can see my post succesfully show at my timeline page");
    }
}
