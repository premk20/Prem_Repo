
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseBody {
	@Test
	
	public void GetWeatherBody()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/Hyderabad");

		// Retrieve the body of the Response
		io.restassured.response.ResponseBody body = response.getBody();

		// By using the ResponseBody.asString() method, we can convert the  body
		// into the string representation.
		System.out.println("Response Body is: " + body.asString());
		
		String bodyAsString = body.asString();
		 Assert.assertEquals(bodyAsString.contains("Hyderabad") /*Expected value*/, true /*Actual Value*/, "Response body contains Hyderabad");
		}

	}
	
}