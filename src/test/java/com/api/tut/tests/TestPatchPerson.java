package com.api.tut.tests;

import com.api.tut.helpers.PersonalServiceHelper;
import com.api.tut.model.Person;
import io.qameta.allure.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static com.api.tut.helpers.PersonalServiceHelper.UpdatePerson;

public class TestPatchPerson {


    @Test(description = "Update the persons in localHost")
    @Step("update the data")
    @Severity(SeverityLevel.CRITICAL)
    public void updateUser(){
        PersonalServiceHelper personalServiceHelper=new PersonalServiceHelper();
        Response res=UpdatePerson(16);
        assertEquals(res.jsonPath().getString("id"),"16");
    }
}
