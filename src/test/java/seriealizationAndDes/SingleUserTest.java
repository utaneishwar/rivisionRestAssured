package seriealizationAndDes;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import pojo.Data;
import pojo.SingleUser;

import static io.restassured.RestAssured.*;

import java.util.List;
public class SingleUserTest 
{
  @Test
  public void Fetchdata()
  {
	  RestAssured.baseURI="https://reqres.in";
        SingleUser response = given()
	                   .when()
	                   .get("api/users/2")
	                   .then()
	                   .log().all()
	                   .extract()
	                   .response()
	                   .as(SingleUser.class);
                         
 
                          Data Stringdata = response.getData();
  
                        String avtar= Stringdata.getAvatar();
                        System.out.println(avtar);//https://reqres.in/img/faces/2-image.jpg
	                   
                        String firstname= Stringdata.getFirst_name();
                
	                    System.out.println(firstname);//Janet
	                   
	  
  }
}
