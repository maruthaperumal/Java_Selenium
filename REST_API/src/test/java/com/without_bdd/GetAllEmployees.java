package com.without_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {
    @Test
	public void getAllEmployees() {
		RestAssured.baseURI = "https://petstore.swagger.io";

		RequestSpecification RequestSpecification = RestAssured.given();

		Response Response = RequestSpecification.request(Method.GET, "#/pet/findPetsByStatus");
		
		System.out.println(Response.asPrettyString());
		
		System.out.println(Response.getStatusLine());
	}

}
