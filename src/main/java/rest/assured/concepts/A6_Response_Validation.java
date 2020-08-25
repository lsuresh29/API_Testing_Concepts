package rest.assured.concepts;

import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class A6_Response_Validation {

	@Test
	public void get_Method() {

		Response response = get("https://reqres.in/api/users/2");

		//General response validation
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getStatusLine());
		System.out.println(response.getTime());
		System.out.println(response.getSessionId());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals("Validation completed",200, statusCode);
		
	}
	
	
	@Test
	public void get_Method1() {
		
		//given --> pre conditions
		//when ---> Submitting request
		//then ---> Validation
		
		given()
			.get("https://reqres.in/api/users/2").
		then()
			.statusCode(200)
			.log().all();
		
	}
	//jsonpath, jsonObject, JsonArray

}
