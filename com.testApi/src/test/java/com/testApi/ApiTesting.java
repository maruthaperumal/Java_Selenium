package com.testApi;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ApiTesting {
	
	@Test
	
	public void testGetPostById() {
		
		RestAssured.baseURI = "https://fakestoreapi.com";
		
		Response respond = 
				given()
				.when()
				.get("/products")
				.then()
				.extract()
				.response();
		
		System.out.println(respond.getBody().asPrettyString());
		
			
	}

}
