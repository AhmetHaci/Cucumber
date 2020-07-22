package com.hrms.API.steps.practice;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

public class CreateEmployeeApi {
	
	public static String emp_id;
	
	private static RequestSpecification request;
	private Response response;
	@Given("user calls to createEmployee API")
	public void user_calls_to_createEmployee_API() {
		request = given().contentType("application/json")
				.header("Authorization",
				SyntaxAPIAuthenticationSteps.Token);
		
		request.body(CommonMethods.readJson(Constants.CREATE_EMPLOYEE_FILEPATH));
	}
	
	
	@When("user retrieves response")
	public void user_retrieves_response() {
		response = request.when().post(Constants.CREATE_EMPLOYEE_URI);
		response.prettyPrint();
	}
	@Then("status code code is {int}")
	public void status_code_code_is(Integer int1) {
		 response.then().assertThat().statusCode(int1);
	}
	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {
		
		JsonPath jsonBody = response.jsonPath();
		emp_id = jsonBody.get("Employee[0].employee_id");
		System.out.println("employee_id = " +emp_id);
	}
	
	}
