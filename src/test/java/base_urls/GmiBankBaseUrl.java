package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

import static utils.AuthenticationHerokuApp.generateToken;

public class GmiBankBaseUrl {
    protected RequestSpecification spec;

    @Before
    public void Setup(){

        spec = new RequestSpecBuilder()
                .setBaseUri("https://gmibank.com/")
                .setContentType(ContentType.JSON)
                .addHeader("Cookie", "token=" + generateToken())
                .build();
    }
}
  // Her sorguda tekrar eden dataları buraya gireceğiz

