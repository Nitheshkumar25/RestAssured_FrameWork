package org.example;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Serialization {
    private static  final ObjectMapper MAPPER=new ObjectMapper();
    PojoPack pack=new PojoPack();
@Test
        public void Serialize() throws JsonProcessingException {
        PojoPack.setPostId("AllRounder");

        PojoPack.setBody("sachin");
        String Json=MAPPER.writeValueAsString(pack);
        System.out.println("pojo"+Json);

         RestAssured.baseURI = "http://localhost:3000/comments";
        given().contentType(ContentType.JSON).body(Json).when().post().then().assertThat().statusCode(201);

    }
}
