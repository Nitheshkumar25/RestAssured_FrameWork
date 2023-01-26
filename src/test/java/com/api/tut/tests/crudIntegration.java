package com.api.tut.tests;

import com.api.tut.helpers.PersonalServiceHelper;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class crudIntegration {
      Response response;
    PersonalServiceHelper personalServiceHelper;
    @Test
    public void createNewPerson() {
        personalServiceHelper = new PersonalServiceHelper();
        response = PersonalServiceHelper.createPerson();
        assertEquals("Aashika", response.jsonPath().getString("firstName"));
        System.out.println("Check users are updated");
        int usersCount=personalServiceHelper.verifyAfterCrud();
        assertEquals(6,usersCount ,"users are updated fine");
        if(usersCount==6){
            System.out.println("users are updated fine");
        }
    }

}
