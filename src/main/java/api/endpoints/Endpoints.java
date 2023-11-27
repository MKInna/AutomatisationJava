package api.endpoints;

public enum Endpoints {
    CREATE_USER("/user"),
    GET_PATH("/user/"),
    GET_TOKEN("/GenerateToken"),
    GET_USER("/User/"),
    BOOK("/Books"),
    DEL_BOOK("/Book");
    private final String endpoint;
    Endpoints(String endpoint){
         this.endpoint = endpoint;
     }
     public String getValue(){
         return endpoint;
     }
}
