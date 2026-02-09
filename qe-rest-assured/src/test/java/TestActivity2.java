import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

public class TestActivity2 {
    private static final String baseURL = "https://petstore.swagger.io/v2/";

    @Test
    public void createUser() {
        Map<String, Object> reqBody = Map.of(
                "firstName", "Azam",
                "lastName", "Mustufa",
                "username", "azamm"
        );
        Response res = RestAssured.given().contentType(ContentType.JSON).body(reqBody).when().post(baseURL + "user").then().statusCode(200).extract().response();
        System.out.println("Create User Res: \n" + res.path("code"));
    }

    @Test(dependsOnMethods = "createUser")
    public void getUser() {
        Response res = RestAssured.given().contentType(ContentType.JSON).when().pathParam("username", "azamm").get(baseURL + "user/{username}").then().extract().response();

        System.out.println("GET REQ: \n" + res.asPrettyString());
    }

    @Test(dependsOnMethods = "getUser")
    public void deleteUser() {
        Response res = RestAssured.given().contentType(ContentType.JSON).when().pathParam("username", "azamm").delete(baseURL + "user/{username}").then().statusCode(200).extract().response();

        System.out.println("DEL REQ: \n" + res.path("message"));
    }
}
