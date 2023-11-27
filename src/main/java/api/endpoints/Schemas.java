package api.endpoints;

public enum Schemas {
    CREATE_USER_SCHEMA("user/CreatePutUserSchema.json"),
    GET_USER_SCHEMA("user/GetUserSchema.json");

    Schemas(String schema) {
        this.schema = schema;
    }

    private final String schema;

    public String getValue() {
        return schema;
    }
}
