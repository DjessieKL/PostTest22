import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class TestDeleteProduk {
    String endpoint = "https://mern-backend-8881.herokuapp.com/products/630507af7207f2c541e4710e";

    @Test
    public void testDeleteProduct() {
        when()
                .delete(endpoint)
                .then()
                .statusCode(200)
                .log().all();
    }

    @Test
    public void testValidasiDelete() {
        given()
                .get(endpoint)
                .then()
                .statusCode(200);
    }
}