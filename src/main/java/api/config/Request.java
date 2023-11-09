package api.config;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class Request extends BaseRequestSpecification {
    public Response post(RequestSpecification request, String body, String endPoint){
        return given()
                .spec(request)
                .body(body)
                .post(endPoint);
    }
    public static ValidatableResponse post(RequestSpecification request, String body, String endPoint, ResponseSpecification response){
        return given()
                .spec(request)
                .body(body)
                .post(endPoint)
                .then()
                .spec(response);
    }

    public ValidatableResponse post(RequestSpecification request, String body, String endPoint, ResponseSpecification response, String path){
        return given()
                .spec(request)
                .body(body)
                .post(endPoint)
                .then()
                .spec(response)
                .body(matchesJsonSchemaInClasspath(path));
    }
    public ValidatableResponse get(RequestSpecification request, String endpoint, String username, ResponseSpecification response, String path){
        return given()
                .spec(request)
                .get(endpoint + username)
                .then()
                .spec(response) ;
    }
    public ValidatableResponse get(RequestSpecification request, String endpoint, String username, ResponseSpecification response){
        return given()
                .spec(request)
                .get(endpoint + username)
                .then()
                .spec(response) ;
    }
    public ValidatableResponse put(RequestSpecification request, String body, String endpoint, String username, ResponseSpecification response){

        return given()
                .spec(request)
                .body(body)
                .put(endpoint + username)
                .then()
                .spec(response);
    }
    public ValidatableResponse delete(RequestSpecification request,String endpoint, String username, ResponseSpecification response ){

        return given()
                .spec(request)
                .delete(endpoint + username)
                .then()
                .spec(response);
    }
    public ValidatableResponse delete(RequestSpecification request,String body,String endpoint,String username, ResponseSpecification response ){

        return given()
                .spec(request)
                .body(body)
                .delete(endpoint)
                .then()
                .spec(response);
    }
}
