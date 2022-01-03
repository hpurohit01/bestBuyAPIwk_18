package com.studentapp.myfirsttest;

import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class MyFirstTest extends TestBase {
    //1
    @Test
      public void getAllStudentInfo(){
    Response response=given()
            .when()
            .get("/list");
    response.then().statusCode(200);
    response.prettyPrint();
}
//2
@Test
    public void getSingleStudent(){
    Response response=given()
            .when()
            .get("/15");
    response.then().statusCode(200);
    response.prettyPrint();

}
//3
@Test

public void searchStudentWithParameter() {
    Response response = given()
            .pathParam("id", 50)
            .when()
            .get("/{id}");
    response.then().statusCode(200);
    response.prettyPrint();
}
//4

    @Test
    public void searchStudentWithQueryParameter() {
        Response response = given()
                .queryParam("programme", "Financial Analysis")
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    //5
    @Test
    public void searchStudentWithQueryParameter1() {
        Response response = given()
                .queryParam("programme", "Computer Science")
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    //6
    @Test
    public void searchStudentWithQueryParameterAndhasMap(){
        HashMap<String, Object> qParams = new HashMap<>();
        Response response = given()
                .queryParam("programme", "Medicine")
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();


    }
    //7

    @Test
    public void searchStudentWithQueryParameterAndHashMap1(){
        HashMap<String, Object> qParams = new HashMap<>();
        qParams.put("programme", "Computer Science");
        qParams.put("programme","Mechanical Engineering");


        Response response=given()
                .queryParams(qParams)
                .when()
                .get("/list");
        response.then().statusCode(200);
        response.prettyPrint();
    }



}


