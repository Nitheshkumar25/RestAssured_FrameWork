package com.api.tut.tests;

import com.api.tut.helpers.PersonalServiceHelper;
import com.api.tut.model.Person;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestGetPerson {
    private static PersonalServiceHelper personalServiceHelper;
    @BeforeClass
    public void init(){
        personalServiceHelper=new PersonalServiceHelper();
    }
    @Test
    public  void GetAllPersons(){
       List<Person> persons= personalServiceHelper.getAllPerson();
       assertNotNull(persons,"Not null Deserialized object:");
       assertEquals(persons.get(0).getFirstName(),"Karthi");
       System.out.println("not null response:"+persons);

    }
}
