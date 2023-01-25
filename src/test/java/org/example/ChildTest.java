package org.example;
//
//import org.hamcrest.Matchers.*;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.hasProperty;
//
//public class ChildTest
//{
//
//    @Test
//    public void createObjAndGet(){
//        ParentDummyTest parent=new ParentDummyTest(7);
//        System.out.println(parent.data);
//        assertThat(parent, hasProperty("data"));
//    }
//}
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.samePropertyValuesAs;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Tests for the Task")
@Nested
class TaskTests {

    // class to be tested
    public class Task {

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public long getId() {
            return id;
        }

        private final long id;
        private String summary;
        private String description;
        private int year;

        public Task(long id, String summary, String description) {
            this.id = id;
            this.summary = summary;
            this.description = description;
        }

        // getters/setters
    }

    //more
    @Test
    void objectHasSummaryProperty() {
        int d=9;
        ParentDummyTest parent=new ParentDummyTest(d,"Nithesh");
       // parent.setData(d);
        assertThat(parent, hasProperty("user"));
    }

//    @Test
    void objectHasCorrectSummaryValue() {
        Task task = new Task(1, "Learn Hamcrest", "Important");
        assertThat(task, hasProperty("summary", equalTo("Learn Hamcrest")));
    }

//    @Test
    void objectHasSameProperties() {
        Task todo1 = new Task(1, "Learn Hamcrest", "Important");
        Task todo2 = new Task(1, "Learn Hamcrest", "Important");

        assertThat(todo1, samePropertyValuesAs(todo2));
    }
}