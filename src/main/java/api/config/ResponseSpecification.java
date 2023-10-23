package api.config;
import api.utils.Utils;

import static api.utils.Utils.getPropertyFromFile;

public class ResponseSpecification {
    private final String APPLICATION_JSON = "Application/json";
    private final String CONTENT_TYPE = "Content-Type";
    private final String url = (String) getPropertyFromFile("url");
}
