package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPostTest extends TestBase {
    @Test
    public void createStudent() {

        List<String> courseList = new ArrayList<>();
        courseList.add("English");
        courseList.add("Account");
        courseList.add("Maths");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Max");
        studentPojo.setLastName("Murphy");
        studentPojo.setEmail("abc1125@gmail.com");
        studentPojo.setProgramme("Medicine");
        studentPojo.setCourses(courseList);

        Response response = given()
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();

    }

    @Test
    public void createStudent1() {

        List<String> courseList = new ArrayList<>();
        courseList.add("Algorithms");
        courseList.add("Account");
        courseList.add("Maths");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Jhon");
        studentPojo.setLastName("Dave");
        studentPojo.setEmail("xyz1131@gmail.com");
        studentPojo.setProgramme("Computer Science" );
        studentPojo.setCourses(courseList);



        Response response = given()
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();


    }
    @Test
    public void createStudent3() {

        List<String> courseList = new ArrayList<>();
        courseList.add("Algorithms");
        courseList.add("Genetics");
        courseList.add("English");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Nisha");
        studentPojo.setLastName("Dave");
        studentPojo.setEmail("Asda2525@gmail.com");
        studentPojo.setProgramme("Computer Science");
        studentPojo.setCourses(courseList);



        Response response = given()
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .post();
        response.then().statusCode(201);
        response.prettyPrint();


}
}