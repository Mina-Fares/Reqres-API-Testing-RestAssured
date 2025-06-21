package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetSingleUserNotFound {
	@Test
	public void testGetAllProductsList() {
		baseURI="https://reqres.in/api";
		given().
		header("x-api-key","reqres-free-v1").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		get("/users/23").
		then().
		statusCode(404).
		log().
		all();
	}
}
