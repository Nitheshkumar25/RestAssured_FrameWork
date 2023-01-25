package com.api.tut.tests;

import com.api.tut.helpers.PersonalServiceHelper;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class TestPostPerson {

    @Test
    public void createNewPerson() {
        PersonalServiceHelper personalServiceHelper = new PersonalServiceHelper();
        String name = PersonalServiceHelper.createPerson().jsonPath().getString("firstName");
        assertEquals("pradhiksna", name);
    }
}
