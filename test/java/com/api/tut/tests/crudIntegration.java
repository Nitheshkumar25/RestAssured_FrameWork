package com.api.tut.tests;

import com.api.tut.helpers.PersonalServiceHelper;
import com.api.tut.utilities.ConfigManager;
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
        assertEquals(ConfigManager.Body.get(1)[0], response.jsonPath().getString("firstName"));
        System.out.println("Check users are updated");
        int usersCount = personalServiceHelper.verifyAfterCrud();
        assertEquals(7, usersCount, "users are updated fine");
        if (usersCount == 7) {
            System.out.println("users are updated fine");
        }
    }

}
