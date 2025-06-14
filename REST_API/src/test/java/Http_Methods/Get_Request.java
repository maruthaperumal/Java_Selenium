package Http_Methods;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class Get_Request {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in/";   // Domain  end point
		
//		Request Specification
//		given(); // pre request {query param, path param, autherization, headers, body}
//		when(); // action       {HTTP methos - get,put,post,patch,delete,..}
		
//		Response Specification 
//	    then(); // validation   {body, cookies, header}
		
		Response response = given().queryParam("page", 2).when().get("api/users").then().extract().response(); 
		System.out.println(response.asPrettyString());

	}

}
