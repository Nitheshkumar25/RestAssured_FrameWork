package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.CoreMatchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matcher.*;

public class TutAPi {
   static  JSONObject requestParams = new JSONObject();

    int i;
    public static void PostData(String body,String postId){
        System.out.println("post method");

        requestParams.put("body", body);
        requestParams.put("postId", postId);
        if(!body.equals("solder")) {
            int statusCode = given().when().contentType(ContentType.JSON).body(requestParams.toJSONString()).post("/comments").statusCode();
            System.out.print("code: " + statusCode);
        }
        else{
            given().when().contentType(ContentType.JSON).body(requestParams.toJSONString()).post("/comments").then().assertThat().statusCode(201).body("id", CoreMatchers.equalTo(15));
        }

    }
    @Test
    public void Basics() {

        RestAssured.baseURI = "http://localhost:3000";
//       Get method
        String response = given().when().get("/comments").body().jsonPath().getString("[1].body");
        System.out.println("response ==" + response);
        //post method
        PostData("Lead","Avatar");
        //post with Hamcrest
        PostData("solder","People");

    }
}
