package json;

import json.common.Header;
import json.common.Parameter;
import json.enums.RequestMethod;

import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/9 23:53
 */
public class Endpoint {
    String name;
    RequestMethod requestMethod;
    String baseURIName;
    String URI;
    List<Parameter> parameters;
    List<Header> headers;
    String payload;
    String contentType = "JSON";
    String authorization = "None";
    DataLocator dataLocator;

}
