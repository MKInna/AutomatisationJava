package api.config;

import api.dto.request.UserRequestBuilder;
import api.endpoints.Endpoints;

import static api.utils.Utils.toJson;

public class Auth extends Request{
    static BaseResponseSpecification response = new BaseResponseSpecification();
    public static String getToken(){
        return   post(requestUser(), toJson(new UserRequestBuilder("Alex","AlexAlex_99@")),
                Endpoints.GET_TOKEN.getValue(), response.OK()).extract().body().path("token");

    }
}
