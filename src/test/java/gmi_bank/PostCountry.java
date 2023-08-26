package gmi_bank;
import base_urls.GmiBankBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.GoRestPojo;
import pojos.gmi_bank.CountryPojo;
import pojos.gmi_bank.StatesPojo;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PostCountry extends GmiBankBaseUrl {
     /*
        https://app.swaggerhub.com/apis/yasinaniltechpro/GmiBank/0.0.1 dokümanını kullanarak en az 3 "state"
        içeren bir "country" oluşturan bir otomasyon testi yazınız.
        Not : Autherization için headers'a "Authorization" = ""Bearer abc123"  şeklinde Bearer token giriniz.
     */

    /*
            Given
                https://gmibank.com/api/tp-countries
            And
                {
                  "name": "Muz Cumhuriyeti",
                  "states": [
                    {
                      "id": 1,
                      "name": "Elma"
                    },
                    {
                      "id": 2,
                      "name": "Armut"
                    },
                    {
                      "id": 3,
                      "name": "Portakal"
                    }
                  ]
                }
            When
                Kullanıcı POST request gönderir
            Then
                Status Code = 201
            And
                Body:
                    {
                        "id": 191781,
                        "name": "Muz Cumhuriyeti",
                        "states": [
                            {
                                "id": 1,
                                "name": "Elma",
                                "tpcountry": null
                            },
                            {
                                "id": 2,
                                "name": "Armut",
                                "tpcountry": null
                            },
                            {
                                "id": 3,
                                "name": "Portakal",
                                "tpcountry": null
                            }
                        ]
                    }
         */

    @Test
    public void postCountry() {
        // Set the URl
        spec.pathParams("first", "api", "second", "tp-countries");

        // Set the expected data
        StatesPojo states1 = new StatesPojo(1,"Elma");
        StatesPojo states2 = new StatesPojo(2,"Armut");
        StatesPojo states3 = new StatesPojo(3,"Portakal");
        List<StatesPojo> stateList = new ArrayList<>();
        stateList.add(states1);
        stateList.add(states2);
        stateList.add(states3);

        CountryPojo expectedData = new CountryPojo("Muz Cumhuriyeti",stateList);
        System.out.println(expectedData);

        //Send the request and get the response
        Response response = given(spec).body(expectedData).when().post("{first}/{second}");
        response.prettyPrint();



    }

}
