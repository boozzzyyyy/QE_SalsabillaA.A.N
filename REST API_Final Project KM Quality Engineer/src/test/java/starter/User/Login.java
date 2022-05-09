package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Login {
    public static String endpoint = "https://be-qa.alta.id/api";

    @Step("I set method POST at api endpoints for login user")
    public String setMethodPost() {
        return this.endpoint + "/auth/login";
    }

    @Step("I send method POST HTTP request for login user")
    public void sendMethodPost(String email, String password) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email",email);
        requestBody.put("password",password);
        SerenityRest.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(this.setMethodPost());
    }

    @Step("I receive valid HTTP response code 200 for login user")
    public void receiveHTTPResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid message login user succesfully")
    public void receiveValidMessage() {
        restAssuredThat(response -> response.body("data", equalTo("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlNhbHNhYmlsbGEgQW5uaXNhIEFsaXl5YWggTnVncmFoYSIsIkVtYWlsIjoic2Fsc2FiaWxsYW51Z3JhaGExMEBnbWFpbC5jb20ifQ.4TKDHbCHfYl-2Akm4M62hQcawlvWdNjZIa5q99evYOA")));
    }
}
