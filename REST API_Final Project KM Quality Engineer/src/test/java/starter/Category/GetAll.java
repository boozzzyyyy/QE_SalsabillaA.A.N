package starter.Category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class GetAll {
    public static String endpoint = "https://be-qa.alta.id/api";

    @Step("I set method GET at api endpoints for get all data category")
    public String setMethodGet() {
        return this.endpoint + "/categories";
    }

    @Step("I send method GET HTTP request for get all data category")
    public void sendMethodGet() {
        SerenityRest.given().get(this.setMethodGet());
    }

    @Step("I receive valid HTTP response code 200 for get all data category")
    public void receiveHTTPResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid message get all data category succesfully")
    public void receiveValidMessage() {
        restAssuredThat(response -> response.body("data[0].ID", equalTo(1   )));
    }
}
