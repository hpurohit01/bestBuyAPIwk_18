package com.studentapp.studentinfo;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class StudentGetTest extends TestBase {
    @Test
    public void searchingAllStudent() {
        Response response = given()
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test
    public void searchingSingleStudent() {
        Response response = given()
                .when()
                .get("/20");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    @Test
    public void searchWithParam() {
        Response response = given()
                .pathParam("id", 25)
                .when()
                .get("{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }

    @Test
    public void searchStudentWithQueryParameter() {
        Response response = given()
                .queryParam("programme", "Financial Analysis")
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void searchStudentWithQueryParameterAndHashMap1(){
        HashMap<String, Object> qParams = new HashMap<>();
        qParams.put("programme", "Computer Science");


        Response response=given()
                .queryParams(qParams)
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }




    }
