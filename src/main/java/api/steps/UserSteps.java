package api.steps;

import api.config.BaseRequestSpecification;
import api.config.Request;
import api.dto.UserBuilder;
import io.restassured.response.Response;

import static api.utils.Utils.toJson;

public class UserSteps extends Request {
    BaseRequestSpecification baseRequest = new BaseRequestSpecification();
    private UserBuilder user = UserBuilder.builder()
            .id(0)
            .username("Alex")
            .build();
    public Response createUser(){
return post(baseRequest.request(), toJson(user), "/user");
    }
}
