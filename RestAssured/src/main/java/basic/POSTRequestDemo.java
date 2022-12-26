package basic;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import modules.CreateUserModel;

public class POSTRequestDemo {
	@BeforeClass
	public void setup()
	{
		RestAssured.baseURI = "https://reqres.in/";
		RestAssured.basePath = "/api";
	}
	@Test
	public void statusCodeVarification()
	{
		CreateUserModel createUser = new CreateUserModel();
		createUser.setJob("leader");
		createUser.setName("morpheus");
		
		given()
			.body(createUser)
		.when()
			.post("/users")
		.then()
			.statusCode(201);
	}
}
