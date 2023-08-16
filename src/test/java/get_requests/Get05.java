package get_requests;

import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertTrue;


public class Get05 {
    /*
       Given
     https://restful-booker.herokuapp.com/booking
     When
     User send a request to the URL
    Then
     Status code is 200
    And
     Among the data there should be someone whose firstname is "Sally" and last name is "Brown"
     */

    @Test
    public void get() {

    }
}
