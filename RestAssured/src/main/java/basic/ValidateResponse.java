package basic;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ValidateResponse {
	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api";
	}
	@Test
	public void statusCodeVarification()
	{
		given()
//			.param("page", 2)
		.when()
			.get("/users/2")
		.then()
			.statusCode(200);
//			.and()
//			.body("data[0].email", equalTo("michael.lawson@reqres.in"))
//			.contentType(ContentType.JSON);
	}
}
