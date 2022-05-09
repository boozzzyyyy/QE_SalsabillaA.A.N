package starter.Product;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class Create {
    public static String endpoint = "https://be-qa.alta.id/api";
    public static String name = "";

    @Step("I set method POST at api endpoints for add new product")
    public String setMethodPost() {
        return this.endpoint + "/products";
    }

    @Step("I send method POST HTTP request for add new product")
    public void sendMethodPost(String name, int price, int categories1, int categories2) {
        this.name = name;

        JSONArray categories = new JSONArray();
        categories.add(categories1);
        categories.add(categories2);

        JSONObject requestBody = new JSONObject();
        requestBody.put("name",name);
        requestBody.put("price",price);
        requestBody.put("categories",categories);
        SerenityRest.given()
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(requestBody.toJSONString())
                .post(this.setMethodPost());
    }

    @Step("I receive valid HTTP response code 200 for add new product")
    public void receiveHTTPResponse() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid message product created succesfully")
    public void receiveValidMessage() {
        restAssuredThat(response -> response.body("data.Name", equalTo(this.name)));
    }
}
