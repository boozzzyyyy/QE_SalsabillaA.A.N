package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Create {
    public static String endpoint = "https://demoqa.com/Account/v1/User";
    private static String paramUsername = "";

    @Step("I set method POST at api endpoints for create user")
    public String setMethodPost() {
        return this.endpoint;
    }

    @Step("I send method POST HTTP request for create user")
    public void sendMethodPost(String username, String password) {
        this.paramUsername = username;
        JSONObject requestBody = new JSONObject();
        requestBody.put("userName",username);
        requestBody.put("password",password);
        SerenityRest.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(this.setMethodPost());
    }

    @Step("I receive valid HTTP response code 201 for create user")
    public void receiveHTTPResponse() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I receive valid message user created succesfully")
    public void receiveValidMessage() {
        restAssuredThat(response -> response.body("username", equalTo(this.paramUsername)));
    }
}
