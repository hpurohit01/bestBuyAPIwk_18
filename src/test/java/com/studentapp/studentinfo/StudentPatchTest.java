package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StudentPatchTest extends TestBase {

    @Test
    public void patchStudent() {

        StudentPojo st = new StudentPojo();
        st.setEmail("abc125@gmail.com");


        Response response = given()
                .pathParam("id", 25)
                .header("Content-Type", "application/json")
                .body(st)
                .when()
                .patch("{id}");
        response.then().statusCode(201);
        response.prettyPrint();

    }

    @Test
    public void patchStudent1() {

        StudentPojo s = new StudentPojo();
        s.setEmail("asda125@gmail.com");


        Response response = given()
                .pathParam("id", 21)
                .header("Content-Type", "application/json")
                .body(s)
                .when()
                .patch("{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}