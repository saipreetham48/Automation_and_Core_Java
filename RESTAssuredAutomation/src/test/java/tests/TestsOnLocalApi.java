package tests;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TestsOnLocalApi {
	@Test
	public void get() {
		baseURI="http://localhost:3000/";
		given().get("/users").then().statusCode(200).log().all();
	}
	
	@Test
	public void post() {
		JSONObject request=new JSONObject();
		request.put("firstname", "jake");
		request.put("secondname", "well");
		request.put("subjectid", 2);
		baseURI="http://localhost:3000/";
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when()
		.post("/users").then().statusCode(201);
	}
	
	@Test
	public void put() {
		JSONObject request=new JSONObject();
		request.put("firstname", "raina");
		request.put("secondname", "suresh");
		request.put("subjectid", 1);
		baseURI="http://localhost:3000/";
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when()
		.put("/users/4").then().statusCode(200);
	}
	
	@Test
	public void patch() {
		JSONObject request=new JSONObject();
		request.put("secondname", "meredith");
		baseURI="http://localhost:3000/";
		given().contentType(ContentType.JSON).accept(ContentType.JSON).body(request.toJSONString()).when()
		.patch("/users/5").then().statusCode(200);
	}
	
	@Test
	public void delete() {
		JSONObject request=new JSONObject();
		baseURI="http://localhost:3000/";
		when().delete("/users/5").then().statusCode(200);
	}

}
