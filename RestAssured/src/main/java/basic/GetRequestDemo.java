package basic;

import org.testng.annotations.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetRequestDemo {
	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api";
	}
	@Test(enabled = false)
	public void statusCodeVarification()
	{
		given()
			.param("page", 2)
		.when()
			.get("/users")
		.then()
			.statusCode(200);
	}
	@Test
	public void getResponseBody()
	{
		Response res = 
		given()
			.param("page", 2)
		.when()
			.get("/users");
		
		System.out.println(res.body().prettyPrint());
	}
}
