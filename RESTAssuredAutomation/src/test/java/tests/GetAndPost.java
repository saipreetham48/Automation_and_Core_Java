package tests;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class GetAndPost {
	@Test
	public void getTest()
	{
		baseURI="https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		body("data[1].first_name", equalTo("Lindsay")).
		body("data.first_name", hasItems("George","Rachel"));
	}
	@Test
	public void postTest() {
		Map<String, Object> map=new HashMap<String, Object>();
//		map.put("name", "sai");
//		map.put("id", 2);
//		System.out.println(map);
		JSONObject request=new JSONObject();
		request.put("name", "sai");
		request.put("id", 2);
		System.out.println(request.toJSONString());
		baseURI="https://reqres.in/api";
//		given().body(request.toJSONString()).when().post("/users").then().statusCode(201);
//		given().body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
		given().header("Content-Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when().post("/users").then().statusCode(201).log().all();
	}
}
