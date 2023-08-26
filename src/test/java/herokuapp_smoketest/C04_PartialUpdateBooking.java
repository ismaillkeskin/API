package herokuapp_smoketest;
import static herokuapp_smoketest.C01_CreateBooking.bookingId;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static utils.ObjectMapperUtils.convertJsonToJava;
import base_urls.HerokuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.HerokuAppTestData;
import java.util.HashMap;
import java.util.Map;
public class C04_PartialUpdateBooking extends HerokuAppBaseUrl {
    /*
        Given
            https://restful-booker.herokuapp.com/booking/:id
        And
            {
                "firstname" : "Ali",
                "lastname" : "Can"
            }
        When
            Kullanıcı PATCH request gönderir
        Then
            Status Code = 200
        And
            {
                "firstname" : "Ali",
                "lastname" : "Can",
                "totalprice" : 111,
                "depositpaid" : true,
                "bookingdates" : {
                    "checkin" : "2018-01-01",
                    "checkout" : "2019-01-01"
                },
                "additionalneeds" : "Breakfast"
            }
     */
    @Test
    public void partialUpdateBooking() {
        // Set the URL
        spec.pathParams("first", "booking", "second", bookingId);
        // Set the expected data
        HerokuAppTestData obj = new HerokuAppTestData();
        Map<String, Object> expectedData = obj.expectedDataMapper("Ali", "Can", null, null, null, null);
        // Send the request
        Response response = given(spec).body(expectedData).when().patch("{first}/{second}");
        response.prettyPrint();
        // Do assertion
        Map<String, String> actualData = convertJsonToJava(response.asString(), HashMap.class);
        assertEquals(200, response.statusCode());
        assertEquals(expectedData.get("firstname"), actualData.get("firstname"));
        assertEquals(expectedData.get("lastname"), actualData.get("lastname"));
    }


}
