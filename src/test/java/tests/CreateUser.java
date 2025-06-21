package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateUser {
	@Test
	public void testGetAllProductsList() {
		JSONObject request=new JSONObject();
		request.put("name","morpheus");
		request.put("job","Engineer");
		baseURI="https://reqres.in/api";
		given().
		header("x-api-key","reqres-free-v1").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request).
		post("/users").
		then().
		statusCode(201).
		log().
		all();
	}
	
}
