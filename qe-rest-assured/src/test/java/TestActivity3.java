import io.restassured.builder.*;
import io.restassured.http.ContentType;
import io.restassured.specification.*;
import org.testng.annotations.*;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class TestActivity3 {
    private static final String baseURL = "https://petstore.swagger.io/v2";
    private static RequestSpecification reqSpec;
    private static ResponseSpecification resSpec;

    @BeforeClass(alwaysRun = true)
    public void setUpSpecs() {
        reqSpec = new RequestSpecBuilder()
                .setBaseUri(baseURL)
                .setContentType(ContentType.JSON)
                .build();

        resSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .build();
    }

    @DataProvider(name = "petData")
    public Object[][] petData() {
        return new Object[][]{
                {77229, "Hansel", "Alive"},
                {77230, "Riley", "Alive"}
        };
    }

    @Test(dataProvider = "petData")
    public void testPostReq(int id, String name, String status) {
        Map<String, Object> reqBody = Map.of(
                "id", id,
                "name", name,
                "status", status
        );

        given().spec(reqSpec)
                .body(reqBody)
                .when()
                .post("/pet")
                .then()
                .spec(resSpec);
    }

    @Test(dataProvider = "petData", dependsOnMethods = "testPostReq")
    public void testGetReq(int id, String name, String status) {
        given().spec(reqSpec)
                .pathParam("petId", id)
                .when()
                .get("/pet/{petId}")
                .then()
                .spec(resSpec)
                .body("name", equalTo(name))
                .body("status", equalTo(status));
    }

    @Test(dataProvider = "petData", dependsOnMethods = "testGetReq")
    public void testDelReq(int id) {
        given().spec(reqSpec)
                .pathParam("petId", id)
                .when()
                .delete("/pet/{petId}")
                .then()
                .spec(resSpec)
                .body("message", equalTo(String.valueOf(id)));
    }
}