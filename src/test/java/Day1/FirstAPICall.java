package Day1;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import  io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class FirstAPICall {
  /*@Test
  public void f() {
	  Response response = RestAssured.given()
			  .proxy("192.168.100.1", 8081)
			  .get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
	  	
	  
	  //HTTP Status Code
	  int status = response.statusCode();
	  System.out.println(status);
	  System.out.println(response.prettyPrint().toString());
	  System.out.println(response.getTime());
	   Assert.assertEquals(status, 200);
	   
	   given() > precondition > proxy
	   when() > user does something get()
	   then() > Verification 
	   
	   given()
	   .proxy("192.168.100.1", 8081)
	   .when()
	   .get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
	   .then()
	   .statusCode(200);
  }*/
  
 

@Test/*(enabled = false)*/
  public void f2() {
	  Response response = RestAssured.given()
			  .proxy("192.168.100.1", 8081)
			  .get("https://parabank.parasoft.com/parabank/services/bank/customers/12212");
	  	
	  
	  //HTTP Status Code
	  int status = response.statusCode();
	  System.out.println(status);
	  System.out.println(response.prettyPrint().toString());
	  System.out.println(response.getTime());
	  
	  Assert.assertEquals(status, 200);
	  
	  given()
	   .proxy("192.168.100.1", 8081)
	   .when()
	   .get("https://parabank.parasoft.com/parabank/services/bank/customers/12212")
	   .then()
	   .statusCode(200);
  }
  
  
}
