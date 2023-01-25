package com.api.tut.helpers;

import com.api.tut.model.Person;
import com.api.tut.utilities.ConfigManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.testng.Assert.*;

import java.lang.reflect.Type;
import java.util.List;

import com.api.tut.constants.EndPoints;
import org.apache.http.HttpStatus;
import org.json.simple.JSONObject;

public class PersonalServiceHelper {
    //We need to read the config variables
// Rest Assured about the URL, Port
// Make a Get REQUEST on this url and send the data to TestGETPerson

    static PersonalServiceHelper personalServiceHelper;
    private static final String BASE_URL = ConfigManager.getInstance().getString("baseUrl");
    private static final String PORT = ConfigManager.getInstance().getString("port");

    public PersonalServiceHelper() {
        RestAssured.baseURI = BASE_URL;
        RestAssured.port = Integer.parseInt(PORT);
        RestAssured.useRelaxedHTTPSValidation();
    }

    public List<Person> getAllPerson() {
        Response response = RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .get(EndPoints.GET_ALL_PERSON)
                .andReturn();
        assertEquals(response.getStatusCode(), HttpStatus.SC_OK, "ok");
        System.out.println("response :" + response.jsonPath().getString("[0].firstName"));
        //Deserialize  JSON Objects to java objects
        Type type = new TypeReference<List<Person>>() {
        }.getType();
        List<Person> personList = response.as(type);
        return personList;
    }
    private static  final ObjectMapper MAPPER=new ObjectMapper();
    static String Json;
    public static Response createPerson() {

        Person person=new Person();
        person.setFirstName("pradhiksna");
        person.setLastName("selvam");
        person.setAge(22);
        person.setId(16);
        person.setAddress("Pollachi");
        person.setPhoneNumbers("9995871119");
        try {
             Json=MAPPER.writeValueAsString(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return RestAssured.given().contentType(ContentType.JSON).when().body(Json).post(EndPoints.CREATE_PERSON);
    }

//    public static void main(String[] args) {
//        personalServiceHelper =new PersonalServiceHelper();
//
//        System.out.println("response -post person:" + createPerson().then().extract().jsonPath().getString("age"));
//    }
}
