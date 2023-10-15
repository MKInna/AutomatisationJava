package api.config;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Request {
    public Response post(RequestSpecification request, String body, String endPoint){
        return given()
                .spec(request)
                .body(body)
                .post(endPoint);
    }
    public Response get(){
        return null;
    }
    public Response put(){
        return null;
    }
    public Response delete(){
         return null;
    }
}
