package starter.Category;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Create {
    public static String endpoint = "https://be-qa.alta.id/api";
    public static String name = "";

    @Step("I set method POST at api endpoints for add new category")
    public String setMethodPost() {
        return this.endpoint + "/categories";
    }

    @Step("I send method POST HTTP request for add new category")
    public void sendMethodPost(String name) {
        this.name = name;
        JSONObject requestBody = new JSONObject();
        requestBody.put("name",name);
        SerenityRest.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(this.setMethodPost());
    }

    @Step("I receive valid HTTP response code 200 for add new category")
    public void receiveHTTPResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid message category created succesfully")
    public void receiveValidMessage() {
        restAssuredThat(response -> response.body("data.Name", equalTo(this.name)));
    }
}
