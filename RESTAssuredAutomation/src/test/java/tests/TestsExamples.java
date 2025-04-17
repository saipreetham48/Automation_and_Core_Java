package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestsExamples {
	@Test
	public void test() {
		//Response resp =RestAssured.get("https://reqres.in/api/users?page=2");
//		System.out.println(resp.getStatusCode());
//		System.out.println(resp.getTime());
//		System.out.println(resp.getBody().asString());
//		System.out.println(resp.getStatusLine());
//		System.out.println(resp.getHeader("content-type"));
//		
//		int statusCode=resp.getStatusCode();
//		Assert.assertEquals(statusCode, 200);
		
	}
	@Test
	public void test2() {
		baseURI="https://reqres.in/api";
		given().get("/users?page=2").then().statusCode(200).body("data[1].first_name", equalTo("Lindsay")).log().all();
	}

}
