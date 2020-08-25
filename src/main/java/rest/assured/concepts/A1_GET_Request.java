package rest.assured.concepts;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class A1_GET_Request {

	//public static void main(String[] args) {
	
	@Test
	public void getMethod() {
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/api/users/2");
		
		String asString = response.asString();
		
		System.out.println("Response:"+asString);
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status code:"+statusCode);
		
		Assert.assertEquals(201, statusCode);
		
	}

}
