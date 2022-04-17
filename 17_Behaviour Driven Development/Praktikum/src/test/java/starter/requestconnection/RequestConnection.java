package starter.requestconnection;

import net.thucydides.core.annotations.Step;

public class RequestConnection {
    @Step("I am on the my network page")
    public void onMyNetworkPage() {
        System.out.println("I am on the my network page");
    }

    @Step("I choose a people from suggestion panel")
    public void choosePeople() {
        System.out.println("I choose a people from suggestion panel");
    }

    @Step("I click button connect")
    public void clickButtonConnect() {
        System.out.println("I click button connect");
    }

    @Step("I can see the button succesfully change to requested")
    public void seeButtonRequested() {
        System.out.println("I can see the button succesfully change to requested");
    }
}
