package seriealizationAndDes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.RequestVirat;
import pojo.ResponseVirat;

import static io.restassured.RestAssured.*;
public class CreateViratKohli 
{
	@Test
	public void createuser()
	{
		RequestVirat requestvirat=new RequestVirat();
	                    	requestvirat.setId(0);
	                    	requestvirat.setUsername("virat2");
	                    	requestvirat.setFirstName("Virat");
	                    	requestvirat.setLastName("Kohli");
	                    	requestvirat.setEmail("kohlivirat@gmail.com");;
	                    	requestvirat.setPassword("virat@123");
	                    	requestvirat.setPhone("1234567890");
	                    	requestvirat.setUserStatus(0);
	                    	
	                    	
 RestAssured.baseURI="https://petstore.swagger.io/v2";
 ResponseVirat responsevirat = given()
							.body(requestvirat)
							.header("Content-Type", "application/json")
							.when()
							.post("/user")
							.then()
							.log().all()
							.extract()
							.response()
							.as(ResponseVirat.class);
							
					//System.out.println(responsevirat);		
					System.out.println(responsevirat.getCode());
					System.out.println(responsevirat.getType());
					System.out.println(responsevirat.getMessage());
					
		
	}

}
