package tests;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class SuccessfulRegister {
	@Test
	public void testGetAllProductsList() {
		JSONObject request=new JSONObject();
		request.put("email","eve.holt@reqres.in");
		request.put("password","pistol");
		baseURI="https://reqres.in/api";
		given().
		header("x-api-key","reqres-free-v1").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request).
		post("/register").
		then().
		statusCode(200).
		log().
		all();
	}
	
}
