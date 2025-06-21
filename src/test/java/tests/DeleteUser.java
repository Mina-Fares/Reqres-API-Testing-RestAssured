package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteUser {
	@Test
	public void testGetAllProductsList() {
		baseURI="https://reqres.in/api";
		given().
		header("x-api-key","reqres-free-v1").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		delete("/users/2").
		then().
		statusCode(204).
		log().
		all();
	}
	
}
