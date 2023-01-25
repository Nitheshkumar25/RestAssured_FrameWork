package Dummy;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//import org.json.JSONException;
//import org.json.JSONObject;
//import org.json.JSONArray;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;

public class JourneyRestAssure {
    public static String requestBody = "{\n" +
            "  \"title\": \"foo\",\n" +
            "  \"body\": \"bar\",\n" +
            "  \"userId\": \"1\" \n}";
    //@Test
    public  void Api(){
       // JSONObject jsonObject = new
              //  JSONObject("{\"title\": \"praveen\",\"body\": \"bar\",\"userId\": \"1\"}");
       int a = given()
                .header("Content-type", "application/json")
                .and()
               // .body(jsonObject)
                .when()
                .post("/posts")
                .then()
                .extract().statusCode();
//      String ResString=  given()
//                .header("Content-type", "application/json")
//                .and()
//                .body(requestBody)
//                .when()
//                .post("/posts")
//                .then()
//                .extract().asString();
      //  System.out.println("response =="+response.jsonPath().getString("body"));
//System.out.print("status code as : "+ResString);
//System.out.print(ResString.indexOf("id"));
        //JSONObject requestParams = new JSONObject();
    //    requestParams.put("userId", "TQ123");
    //    requestParams.put("isbn", "9781449325862");
        System.out.println("a");
        RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json"); // Add the Json to the body of the request
//        request.body(requestParams.);
    }

//    @BeforeTest


    public  void Setup(){
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }
}
