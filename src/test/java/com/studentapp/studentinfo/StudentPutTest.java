package com.studentapp.studentinfo;

import com.studentapp.model.StudentPojo;
import com.studentapp.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class StudentPutTest extends TestBase {
    /*{
    "id": 25,
    "firstName": "Paki",
    "lastName": "Samson",
    "email": "abc125@gmail.com",
    "programme": "Law",
    "courses": [
        "Criminal Law",
        "Constitutional Law",
        "Property Law",
        "Contracts"
    ]
}
*/
    @Test
    public void putStudentRecord(){

        List<String>list=new ArrayList<>();
        list.add("java");
        list.add("jira");
        list.add("postman");
        list.add("Algorithms");

        StudentPojo st=new StudentPojo();
        st.setFirstName("Kaven");
        st.setLastName("Murphy");
        st.setEmail("prime120@gmail.com");
        st.setProgramme("Computer");

        Response response = given()
                .pathParam("id",31)
                .header("Content-Type", "application/json")
                .body(st)
                .when()
                .put("{id}");
        response.then().statusCode(201);
        response.prettyPrint();


    }
    @Test
    public void putStudentRecord1() {


        List<String> courseList = new ArrayList<>();
        courseList.add("Accounting");
        courseList.add("Statistics");

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setFirstName("Andrew");
        studentPojo.setLastName("Shah");
        studentPojo.setEmail("andrew12@gmail.com");
        studentPojo.setProgramme("cloud");
        studentPojo.setCourses(courseList);

        Response response = given()
                .pathParam("id", 101)
                .header("Content-Type", "application/json")
                .body(studentPojo)
                .when()
                .put("/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
