package rest.assured.concepts;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class A2_ALL_HTTP_Methods_Git {

	String username = "lsuresh29@gmail.com";
	String password = "Admingit@123";

	@Test(priority = 1)
	public void GET_Method() {

		RestAssured.baseURI = "https://api.github.com";

		int responseCode = given().log().all()
				.pathParam("user", "lsuresh29")
				.auth().preemptive().basic(username, password)

				.when().get("/users/{user}/repos")

				.then().log().all().extract().response().statusCode();
		
		Assert.assertEquals(responseCode, "200");
	}

	@Test(priority = 2)
	public void PUT_Method() {

		RestAssured.baseURI = "https://api.github.com";

		int responseCode  = given().log().all()
				.pathParam("user", "lsuresh29").pathParam("repo", "Hello-World4")
			    .header("Accept", "application/vnd.github.mercy-preview+json")
				.auth().preemptive().basic(username, password)
				.body(PayLoad_GIT.updateRepo())

				.when().put("/repos/{user}/{repo}/topics")

				.then().log().all().extract().response().statusCode();
		
		Assert.assertEquals(responseCode, "200");
	}

	@Test(priority = 3)
	public void POST_Method() {

		RestAssured.baseURI = "https://api.github.com/";

		int responseCode  = given().log().all()
				.auth().preemptive().basic(username, password)
				.body(PayLoad_GIT.createRepo())

				.when().post("/user/repos")

				.then().log().all().extract().response().statusCode();
		
		Assert.assertEquals(responseCode, "201");
	}

	@Test(priority = 4)
	public void DELETE_Method() {

		RestAssured.baseURI = "https://api.github.com";

		int responseCode  = given().log().all()
				.pathParam("user", "lsuresh29").pathParam("repo", "Hello-World12")
				.auth().preemptive().basic(username, password)
				.when().delete("/repos/{user}/{repo}")

				.then().log().all().extract().response().statusCode();
		
		Assert.assertEquals(responseCode, "204");
	}

	// @Test(priority = 5)
	public void PATCH_Method() {

		RestAssured.baseURI = "https://api.github.com/";

		int responseCode = given().log().all()
				.auth().preemptive().basic(username, password)
				.body(PayLoad_GIT.updateRepo())

				.when().patch("/user/repos")

				.then().log().all().extract().response().statusCode();
		
		Assert.assertEquals(responseCode, "204");

	}

}
