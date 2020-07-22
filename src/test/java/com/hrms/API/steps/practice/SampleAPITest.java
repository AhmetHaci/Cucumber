package com.hrms.API.steps.practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class SampleAPITest {

	//@Test
	public void getAllJobTitles () {
		
		Response response=RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTQ4MTE1MDcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NDg1NDcwNywidXNlcklkIjoiODk3In0.FTGRyD6kdkuRA6pqRWAFf6wXwUJ2vbqUJZe5iC7vCN8 ")
		.when().get("http://18.232.148.34/syntaxapi/api/jobTitle.php");
		response.prettyPrint();
		int actualResonseCode=response.getStatusCode();
		System.out.println(actualResonseCode);
		
	}
	//@Test
	public void getOneEmployee() {
		Response response=RestAssured.given().param("employee_id", "16490A").contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTQ4MTE1MDcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NDg1NDcwNywidXNlcklkIjoiODk3In0.FTGRyD6kdkuRA6pqRWAFf6wXwUJ2vbqUJZe5iC7vCN8")
		.when().get("http://18.232.148.34/syntaxapi/api/getOneEmployee.php");
		response.prettyPrint();
		
		int getOneEmployeeStatusCode=response.statusCode();
		System.out.println(getOneEmployeeStatusCode);
		
		
		
	}
	//@Test
	public void getAllEmployees () {
		Response response =RestAssured.given().contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTQ4MTE1MDcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NDg1NDcwNywidXNlcklkIjoiODk3In0.FTGRyD6kdkuRA6pqRWAFf6wXwUJ2vbqUJZe5iC7vCN8")
			.when().get("http://18.232.148.34/syntaxapi/api/getAllEmployees.php");	
		response.prettyPrint();
		int getAllEmployees=response.statusCode();
		System.out.println(getAllEmployees);
	}
	@Test
	public void createAnEmployee () {
		Response response =RestAssured.given().contentType("application/json").header("Authorization","Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTQ4MTE1MDcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NDg1NDcwNywidXNlcklkIjoiODk3In0.FTGRyD6kdkuRA6pqRWAFf6wXwUJ2vbqUJZe5iC7vCN8")
				.param("emp_firstname", "Ahmet")
				.param("emp_lastname", "Haciosmanoglu")
				.param("emp_middle_name", "Said")
				.param("emp_gender", "2")
				.param("emp_birthday", "1984-01-09")
				.param("emp_status", "Employee")
				.param("emp_title", "Developer")
				.when().post("http://18.232.148.34/syntaxapi/api/createEmployee.php");	
		         response.prettyPrint();
		         int actualResonseCode=response.getStatusCode();
		         Assert.assertEquals(201, actualResonseCode);
	}
}