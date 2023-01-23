//package org.example;
//
//import static org.junit.jupiter.api.Assertions.fail;
//
//import java.util.Arrays;
//import java.util.List;
//
//import org.hamcrest.Matchers;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Nested;
//import org.junit.jupiter.api.Test;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.*;
//public class HamcrestSimpleExamplesTests {
//
//
//    // tests for the list
//    @DisplayName("Tests for the List")
//    @Nested
//    class ListTests {
//
//        private List<Integer> list;
//
////        @BeforeEach
////        public void setup() {
////            list = Arrays.asList(5, 2, 4);
////        }
//
////        @Test
////        @DisplayName("List should have an intial size of 3")
////        void ensureInitialSize() {
////            fail();
////        }
////
////        @Test
////        @DisplayName("Check content of the array")
////        void containsNumbersInAnyOrder() {
////            fail();
////        }   private Integer[] ints;
//
//
////        @Test
////        void everyItemGreaterThan1() {
////            fail();
////        }
////    }
//
//        @DisplayName("Tests for the array")
//        @Nested
//        class ArrayTests {
//            private Integer[] ints;
//
////        @BeforeEach
////        public void setup() {
////            ints = new Integer[] { 7, 5, 12, 16 };
////
////        }
////
////        @Test
////        void arrayHasSizeOf4() {
////            fail();
////        }
////
////        @Test
////        void arrayContainsNumbersInGivenOrder() {
////            fail();
////        }
////    }
//
//            @DisplayName("Tests for the Task")
//            @Nested
//            class TaskTests {
//
//                // class to be tested
//                public class Task {
//
//                    final long id;
//                    String summary;
//                    String description;
//                    int year;
//
//                    public Task(long id, String summary, String description) {
//                        this.id = id;
//                        this.summary = summary;
//                        this.description = description;
//                    }
//
//                    // getters/setters
//                }
//
//                // tests for the Task
//                @Test
//                void objectHasSummaryProperty() {
//                    Task task = new Task(1, "Learn Hamcrest", "Important");
//                    assertThat(task, hasProperty("description",equalTo("Learn Hamcrest")));
//                }
//
////        @Test
////        void objectHasCorrectSummaryValue() {
////            Task task = new Task(1, "Learn Hamcrest", "Important");
////            fail();
////        }
//
////        @Test
////        void objectHasSameProperties() {
////            Task todo1 = new Task(1, "Learn Hamcrest", "Important");
////            Task todo2 = new Task(1, "Learn Hamcrest", "Important");
////            fail();
////        }
////    }
//
////    @DisplayName("Tests for String")
////    @Nested
////    class StringTests {
////        // tests for string
////        @Test
////        void ensureThatAnEmptryStringIsEmpty() {
////            String input = "";
////            fail();
////        }
////
////        @Test
////        void ensureThatAStringIsEitherNullOrEmpty() {
////            String input = "";
////            fail();
////        }
////    }
//            }
//        }
//    }}