package restassured.deserialization;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import restassured.deserialization.pojo.ResponsePage;

public class Deserialization {
	
	@Test
	public void getUser() {
		
		RestAssured.baseURI="https://reqres.in/api/users";
		
		Response response = RestAssured.given().queryParam("page", "2").get();
		
		ResponsePage responsePage = response.as(ResponsePage.class);
		
		System.out.println(responsePage.getData().get(5).getLast_name());
		System.out.println(responsePage.getAd().getUrl());
		System.out.println(responsePage.toString());
	}
}
