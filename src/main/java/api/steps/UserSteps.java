package api.steps;

import api.config.BaseRequestSpecification;
import api.config.BaseResponseSpecification;
import api.config.Request;
import api.dto.request.UserBuilder;
import api.dto.response.DeleteUserResponse;
import api.dto.response.GetUserResponseBuilder;
import api.dto.response.UpdateUserResponse;
import api.dto.response.UserCreateResponseBuilder;
import api.endpoints.Endpoints;
import api.endpoints.Schemas;
import api.utils.Utils;
import lombok.var;
import static api.utils.Utils.toJson;


public class UserSteps extends Request {
    BaseRequestSpecification baseRequest = new BaseRequestSpecification();
    BaseResponseSpecification baseResponse = new BaseResponseSpecification();
    public UserCreateResponseBuilder createUser(UserBuilder user){
    var response = post(baseRequest.request(), toJson(user), Endpoints.CREATE_USER.getValue(), baseResponse.OK(),
            Schemas.CREATE_USER_SCHEMA.getValue())
            .extract()
            .body()
            .asString();
    return Utils.fromJson(response,UserCreateResponseBuilder.class);
    }
    public GetUserResponseBuilder getUser(String username)
    {
        var response = get(baseRequest.request(), Endpoints.GET_PATH.getValue(), username, baseResponse.OK(), Schemas.GET_USER_SCHEMA.getValue())
                .extract()
                .body()
                .asString();
        return Utils.fromJson(response, GetUserResponseBuilder.class);

    }
    public GetUserResponseBuilder getUser(String username, UserBuilder user)
    {
        var response = get(baseRequest.request(), Endpoints.GET_PATH.getValue(), user.getUsername(), baseResponse.DELETE(),Schemas.GET_USER_SCHEMA.getValue())
                .extract()
                .body()
                .asString();
        return Utils.fromJson(response, GetUserResponseBuilder.class);

    }
    public UpdateUserResponse updateUser (String username, UserBuilder user){
       var response = put(baseRequest.request(), toJson(user), Endpoints.GET_PATH.getValue(), username,baseResponse.OK())
               .extract()
               .body()
               .asString();
       return Utils.fromJson(response, UpdateUserResponse.class);

    }
    public DeleteUserResponse deleteUser (String username){
        var response = delete(baseRequest.request(), Endpoints.GET_PATH.getValue(), username, baseResponse.OK())
                .extract()
                .body()
                .asString();
        return Utils.fromJson(response,DeleteUserResponse.class);
    }
}
