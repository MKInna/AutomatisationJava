package api.config;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import static api.utils.Utils.getPropertyFromFile;


public class BaseRequestSpecification {
    private static final  String APPLICATION_JSON = "application/json";
    private static final String CONTENT_TYPE = "Content-type";
    private final String url = (String) getPropertyFromFile("url");
    private static final String url_book_store = (String) getPropertyFromFile("url_book_store");
    private static final String ACCOUNT = "Account/";
    private static final String BOOK_STORE = "BookStore/";


    public RequestSpecification request(){
        return new RequestSpecBuilder()
                .setBaseUri(url)
                .setBasePath("v2")
                .addHeader(CONTENT_TYPE,APPLICATION_JSON)
                .build();
    }
    public RequestSpecification requestWithToken(){
        final Auth auth = new Auth();

        return new RequestSpecBuilder()
                .setBaseUri(url_book_store)
                .setBasePath(ACCOUNT +"v1")
                .addHeader(CONTENT_TYPE,APPLICATION_JSON)
                .addHeader("Authorization", "Bearer " + Auth.getToken())
                .build();
    }
   public static RequestSpecification requestBook(){
        return new RequestSpecBuilder()
                .setBaseUri(url_book_store)
                .setBasePath(BOOK_STORE + "v1")
                .addHeader(CONTENT_TYPE,APPLICATION_JSON)
                .addHeader("Authorization", "Bearer " + Auth.getToken())
                .build();
    }
    public RequestSpecification deleteBook(){
        return new RequestSpecBuilder()
                .setBaseUri(url_book_store)
                .setBasePath(BOOK_STORE + "v1")
                .addHeader(CONTENT_TYPE,APPLICATION_JSON)
                .addHeader("Authorization", "Bearer " + Auth.getToken())
                .build();
    }
    public static RequestSpecification requestUser(){
        return new RequestSpecBuilder()
                .setBaseUri(url_book_store)
                .setBasePath(ACCOUNT + "v1")
                .addHeader(CONTENT_TYPE,APPLICATION_JSON)
                .build();

    }
}
