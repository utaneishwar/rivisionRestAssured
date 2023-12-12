package seriealizationAndDes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.ListData;
import pojo.ListUsers;

import static io.restassured.RestAssured.*;

import java.util.List;
public class ListUserTest 
{
 @Test
 public void fetchdatalist()
 {
	 RestAssured.baseURI="https://reqres.in/";
	 ListUsers listresponse = given()
	                         .when()
	                         .get("api/users?page=2")
	                         .then()
	                         .log().all()
	                         .extract()
	                         .response()
	                         .as(ListUsers.class);
	 
	      int size = listresponse.getData().size();
	     
	     
	 for(int i=0; i<size; i++)
	 {
		int allid = listresponse.getData().get(i).getId();
		
		String allfirstname = listresponse.getData().get(i).getFirst_name();
		
		System.out.println(allid);
		System.out.println(allfirstname);
	 }

	 
	 
			 
 }


}

