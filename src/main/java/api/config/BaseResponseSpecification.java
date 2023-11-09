package api.config;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.apache.http.HttpStatus;

import static api.utils.Utils.getPropertyFromFile;

public class BaseResponseSpecification {
    private final String APPLICATION_JSON = "Application/json";
    private final String CONTENT_TYPE = "Content-Type";
    private final String url = (String) getPropertyFromFile("url");
    public ResponseSpecification OK(){
        return new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_OK)
                .build();
    }
    public ResponseSpecification DELETE(){
        return new ResponseSpecBuilder()
                .expectStatusCode(HttpStatus.SC_NOT_FOUND)
                .build();
    }
}
