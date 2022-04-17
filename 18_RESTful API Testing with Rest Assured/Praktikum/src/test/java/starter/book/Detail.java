package starter.book;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Detail {
    public static String endpoint = "https://demoqa.com/BookStore/v1/Book";
    private static String paramISBN = "";

    @Step("I set method GET at api endpoints")
    public String setMethodGet(String ISBN) {
        this.paramISBN = ISBN;
        return this.endpoint + "?ISBN=" + this.paramISBN;
    }

    @Step("I send method GET HTTP request")
    public void sendMethodGet() {
        SerenityRest.given().header("accept", "application/json").get(this.setMethodGet(this.paramISBN));
    }

    @Step("I receive valid HTTP response code 200")
    public void receiveHTTPResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for list of book")
    public void receiveValidData() {
        restAssuredThat(response -> response.body("isbn", equalTo(this.paramISBN)));
    }
}
