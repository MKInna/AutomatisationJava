package api.config;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class Request extends BaseRequestSpecification {
    public Response post(RequestSpecification request, String body, String endPoint){
        return given()
                .spec(request)
                .body(body)
                .post(endPoint);
    }
    public String get(){
        Response response = given()
                .spec(requestGetUserName())
                .get();
        return response.path("username");
    }
    public Response put(){
        return null;
    }
    public Response delete(){
        return null;
    }
}
