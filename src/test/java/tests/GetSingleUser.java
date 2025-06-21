package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetSingleUser {
	@Test
	public void testGetAllProductsList() {
		baseURI="https://reqres.in/api";
		given().
		header("x-api-key","reqres-free-v1").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		get("/users/2").
		then().
		statusCode(200).
		log().
		all();
	}
}
