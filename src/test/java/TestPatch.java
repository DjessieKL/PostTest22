import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class TestPatch{
    String endpoint = "https://mern-backend-8881.herokuapp.com/products/63589c0b4003bd055fd63f21";

    @Test
    public void testPatch() {
        JSONObject request = new JSONObject();
        request.put("name", "Djessiekl");
        request.put("price", 10000);
        System.out.println(request.toJSONString());

        given()
                .header("Content-Type", "application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .patch(endpoint)
                .then()
                .statusCode(200)
                .log().all();
    }
}