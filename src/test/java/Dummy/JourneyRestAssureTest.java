package Dummy;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import org.json.simple.JSONObject;

public class JourneyRestAssureTest {

   @Test
    public void HttpMethods() {
       JSONObject requestParams = new JSONObject();
       requestParams.put("name", "TQ123");
       requestParams.put("job", "lead");

       RestAssured.baseURI ="https://reqres.in";
//       RequestSpecification request = RestAssured.given();
//       request.header("Content-Type", "application/json");
//       request.body(requestParams.toJSONString()); // Post the request and check the response
//       Response response = request.post("/api/users");

       //RestAssured.given().header("Content-Type","application/json").body(requestParams.toJSONString()).post("/api/users");
       System.out.println("The status received: " +    RestAssured.given().header("Content-Type","application/json").body(requestParams.toJSONString()).post("/api/users").statusLine());
    System.out.println(RestAssured.given().head());
   }
}