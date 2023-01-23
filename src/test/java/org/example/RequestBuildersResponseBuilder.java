package org.example;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.hamcrest.CoreMatchers;
import org.testng.annotations.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;


public class RequestBuildersResponseBuilder {

    RequestSpecBuilder requestBuilders = new RequestSpecBuilder();
    static ResponseSpecification responseSpec;
    public  RequestSpecification getCommonEndpoint() {
        requestBuilders.setBaseUri("https://reqres.in/");
        requestBuilders.setBasePath("api/users");
        RequestSpecification requestSpecs=requestBuilders.build();

        return  requestSpecs;
    }
    public static ResponseSpecification GetResponseSpec(){
        responseSpec= new ResponseSpecBuilder().expectStatusCode(200).build();

        return responseSpec;
    }

    @Test
    public void getUsers(){
        given().spec(getCommonEndpoint()).when().queryParams("page","2").get().then().log().all().assertThat().body("support.url", CoreMatchers.equalTo("https://reqres.in/#support-heading"));
    }
@Test
    public void GetUserResponse(){
    given().spec(getCommonEndpoint()).when().queryParams("page","2").get().then().spec(GetResponseSpec());
}
}

