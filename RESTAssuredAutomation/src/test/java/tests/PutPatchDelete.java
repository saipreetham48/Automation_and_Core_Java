package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class PutPatchDelete {
	@Test
	public void putTest() {
		JSONObject request=new JSONObject();
		request.put("name", "cake");
		request.put("id", 4);
		
		baseURI="https://reqres.in/api";
		given().headers("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when()
		.put("/users/2").then().statusCode(200).log().all();
	}
	@Test
	public void patchTest() {
		JSONObject request=new JSONObject();
		request.put("name", "sai");
		request.put("id", 6);
		baseURI="https://reqres.in/api";
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).
		body(request.toJSONString()).when().patch("/users/2").then().statusCode(200).log().all();
	}
	@Test
	public void deleteTest() {
		baseURI="https://reqres.in/api";
		given().delete("/users/2").then().statusCode(204).log().all();
	}

}
