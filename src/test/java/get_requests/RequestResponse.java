package get_requests;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestResponse {
      /*
    1- Manuel API testi için Postman kullanıyoruz.
    2- API otomasyon testi için REST Assured kütüphanesini kullanıyoruz.
    3- Otomasyon kodlarının yazımı için şu adımları izleriz:
        A- Gereksinimleri anlama
        B- Test senaryosu yazma
            a- Test senaryosu yazmak içi Gherkin dilini kullanıyoruz.
                - Given: Endpoint, body ...
                - When: get, put, post gibi işlemler
                - Then: Assertion, Close ...
                - And: Çoklu işlemlerin art arda yapıldığı zaman kullanılır.

        C- Otomasyon kodlarını yazarken şu adımları izleriz:
            1- Set the URL = URL'i tanımla
            2- Set the expected data = Beklenen dataları ayarla
            3- Send the request and get the response = İsteği gönder ve cevabı al
            4- Do assertion = Doğrulama yap
     */

    public static void main(String[] args) {
   // Get testi nasıl yapılır?
      String url = "https://petstore.swagger.io/v2/pet/1923";
     Response response = given().when().get(url);
       // System.out.println(response);
       response.prettyPrint();

     // Status Code nasıl yazılır?
        int status = response.statusCode();
        System.out.println("Status Code: " + response.statusCode());

      // Content Type nasıl yazdırılır?
        System.out.println("Content Type: " + response.contentType());

      //Status Line nasıl yazdırılır?
        System.out.println("Status Line: " + response.statusLine());

     // Header'daki veriler nasıl yazdırılır?
        System.out.println("Header | Server: " + response.header("Server"));
        System.out.println("*****************************");
        System.out.println("Header | Connection: " + response.header("Connection"));
        System.out.println("*********************************");

     // Hedars nasıl yazdırılır?
        System.out.println("Headers: " + response.headers());
        System.out.println("****************************************");

     // Time nasıl yazdırılır?
        System.out.println("Time: " + response.time());

    }
}
