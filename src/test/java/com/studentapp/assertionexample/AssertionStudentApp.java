package com.studentapp.assertionexample;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AssertionStudentApp {


    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 8080;
        response = given()
                .when()
                .get("/student")
                .then().statusCode(200);
    }
    @Test
    public void test1(){
       // response.body("id",equalTo(101));
      //  response.body("data[0].courses[0]", hasKey("courses"));
      //  response.body("programme", hasItem("Financial Analysis"));

    }
}
