package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetDetails {
    public static String endpoint = "https://be-qa.alta.id/api";

    @Step("I set method GET at api endpoints for get data details product")
    public String setMethodGet() {
        return this.endpoint + "/products/1583";
    }

    @Step("I send method GET HTTP request for get data details product")
    public void sendMethodGet() {
        SerenityRest.given().get(this.setMethodGet());
    }

    @Step("I receive valid HTTP response code 200 for get data details product")
    public void receiveHTTPResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid message about details product")
    public void receiveValidMessage() {
        restAssuredThat(response -> response.body("data.ID", equalTo(1583)));
    }
}
