import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;


public class TestActivity1 {
    private static final String baseURL = "https://petstore.swagger.io/v2/";

    @Test
    public void testPostReq() {
        Map<String, Object> reqBody = Map.of(
                "id", 444555,
                "name", "XYZAB",
                "status", "available"
        );
        Response res = RestAssured.given().contentType(ContentType.JSON).body(reqBody).when().post(baseURL + "pet").then().statusCode(200).extract().response();
        System.out.println(res.asPrettyString());
    }

    @Test(dependsOnMethods = "testPostReq")
    public void testGetReq() {
        Response res = RestAssured.given().contentType(ContentType.JSON).when().pathParam("petId", 444555).get(baseURL + "pet/{petId}/");
        System.out.println("GET RESPONSE: ");
        System.out.println(res.asPrettyString());
    }

    @Test(dependsOnMethods = "testGetReq")
    public void testPutReq() {
        Map<String, Object> updateBody = Map.of(
                "id", 444555,
                "name", "XYZAB",
                "status", "sold"
        );
        Response res = RestAssured.given().contentType(ContentType.JSON).body(updateBody).when().put(baseURL + "pet").then().statusCode(200).extract().response();
        System.out.println("Put Req: \n" + res.asPrettyString());
    }

    @Test(dependsOnMethods = "testPutReq")
    public void testDelReq() {
        Response res = RestAssured.given().contentType(ContentType.JSON).pathParam("petId", 444555).when().delete(baseURL + "pet/{petId}/").then().statusCode(200).extract().response();
        System.out.println("Del Req: \n" + res.asPrettyString());
    }
}