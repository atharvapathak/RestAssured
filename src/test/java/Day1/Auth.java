package Day1;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth {
  @Test(enabled = false)
  public void f() {
	  
	  given()
	  .proxy("192.168.100.1", 8081)
	  .auth()
	  .oauth2("f8f3c4ee3093a2376332256436879ea5582d9e23")
	  .when()
	  .post("http://coop.apps.symfonycasts.com/api/427/chickens-feed")
	  .then()
	  .statusCode(200);
	  
	  
  }
  
  @Test(enabled = true)
  public void f2() {
	  
	 Response R = given()
	  .proxy("192.168.100.1", 8081)
	  .formParam("client_id", "DemoAPP")
	  .formParam("client_secret", "f8f3c4ee3093a2376332256436879ea5582d9e23")
	  .formParam("grant_type", "client_credentials")
	  .when()
	  .post("http://coop.apps.symfonycasts.com/token");
	 
	 System.out.println(R.jsonPath().prettify());
	 String token = R .jsonPath().get("access_token");
	 System.out.println("Token is"+token);
	 
	 
	 /*using genaerated token*/
	 given()
	 .proxy("192.168.100.1", 8081)
	 .auth()
	 .oauth2(token)
	 .post("http://coop.apps.symfonycasts.com/api/427/chickens-feed")
	  .then()
	  .statusCode(200);
}
}
