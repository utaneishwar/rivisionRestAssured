package basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.*;
public class CreateUser
{
	@Test (enabled = false)
	public void create()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		 Response resp = given()
				        .body("{\r\n"
				        		+ "  \"id\": 0,\r\n"
				        		+ "  \"username\": \"amar\",\r\n"
				        		+ "  \"firstName\": \"Amar\",\r\n"
				        		+ "  \"lastName\": \"Shah\",\r\n"
				        		+ "  \"email\": \"AmarShah@gmail.com\",\r\n"
				        		+ "  \"password\": \"Pass@123\",\r\n"
				        		+ "  \"phone\": \"1122334455\",\r\n"
				        		+ "  \"userStatus\": 0\r\n"
				        		+ "}")
				        .header("content-type","application/json")
				        .when()
				        .post("/user")
				        .then()
				        .log().all()
				        .extract()
				        .response();

		//String Stringresponse =resp.asPrettyString();
		//System.out.println(Stringresponse);
		
		System.out.println(resp.statusCode());
		
		
	}
	@Test
	public void fetch()
	{
		RestAssured.baseURI="https://petstore.swagger.io/v2";
		Response resp = given()
				       .when()
				       .get("/user/amar")
				       .then()
				       .extract()
				       .response();

		String Stringresponse =resp.asPrettyString();
		System.out.println(Stringresponse);
		
		System.out.println(resp.statusCode());
		
	}

}
