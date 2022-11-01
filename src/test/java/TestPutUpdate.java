import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class TestPutUpdate {
    String endpoint = "https://mern-backend-8881.herokuapp.com/products/62e20f1cf0e24546b900e056";

    @Test
    public void testPut() {
        JSONObject request = new JSONObject();
        request.put("name", "Bootcamp 7 2022");
        request.put("category", "Katalon");
        request.put("price", 200);
        System.out.println(request.toJSONString());

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put(endpoint)
                .then()
                .statusCode(404)
                .log().all();
    }
}
