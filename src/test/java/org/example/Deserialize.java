package org.example;

import io.restassured.RestAssured;
import java.util.Arrays;


public class Deserialize {
    //return one Record
    static String url="http://localhost:3000/comments/6";
   ;

    public static void main(String[] args) {
        //get single user Detail
//        PojoPackDo pojoPack_single=RestAssured.given().when().get(url).as(PojoPackDo.class);
//        System.out.println("Objects "+pojoPack_single);
       //get multiple comments (multiple serialization)
        try {
           PojoPackDo[] allCmt = RestAssured.get("http://localhost:3000/comments/").as(PojoPackDo [].class);

           System.out.println("all cmts :" + (Arrays.toString(allCmt)));
       }
       catch (Exception e){
           e.printStackTrace();
       }
    }
}
