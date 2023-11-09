package api.steps;

import api.config.BaseRequestSpecification;
import api.config.BaseResponseSpecification;
import api.config.Request;
import api.dto.request.BookBuilderRequest;
import api.dto.request.CollectionOfIsbn;
import api.dto.request.DeleteBookBuilder;
import api.dto.response.BookDeleteResponseBuilder;
import api.dto.response.BookUserResponseBuilder;
import api.endpoints.Endpoints;
import api.utils.Utils;
import io.restassured.specification.RequestSpecification;
import lombok.var;

import java.util.ArrayList;

import static api.utils.Utils.toJson;


public class UserBookStoreSteps extends Request {
    BaseRequestSpecification request = new BaseRequestSpecification();
    BaseResponseSpecification baseResponse = new BaseResponseSpecification();


    public BookUserResponseBuilder getUser(){

      var response = get(request.requestWithToken(), Endpoints.GET_USER.getValue(),
              "9cb3cc35-e88c-4f5d-9261-787cb307befd", baseResponse.OK())
              .extract()
              .body()
              .asString();
        BookUserResponseBuilder book = Utils.fromJson(response, BookUserResponseBuilder.class);
        return book;
    }
    public BookUserResponseBuilder addBook(){

        CollectionOfIsbn collection = new CollectionOfIsbn();
        collection.setIsbn("9781449331818");
       ArrayList<CollectionOfIsbn> list = new ArrayList<>();
       list.add(collection);
        var response = post(requestBook(), toJson(new BookBuilderRequest("9cb3cc35-e88c-4f5d-9261-787cb307befd", list)),
                Endpoints.BOOK.getValue(),baseResponse.ADD())
                .extract()
                .body()
                .asString();
        BookUserResponseBuilder book = Utils.fromJson(response, BookUserResponseBuilder.class);
        return book;
    }
    public RequestSpecification deleteBook() {
        var response = delete(request.deleteBook(),toJson(new DeleteBookBuilder("9781449331818","9cb3cc35-e88c-4f5d-9261-787cb307befd")),
                Endpoints.DEL_BOOK.getValue(), "9cb3cc35-e88c-4f5d-9261-787cb307befd", baseResponse.DELETE_BOOK())
                .extract()
                .body()
                .asString();
        BookDeleteResponseBuilder response1 = Utils.fromJson(response, BookDeleteResponseBuilder.class);

        return (RequestSpecification) response1;
    }



}
