package json;

import json.common.Header;
import json.common.Parameter;
import json.enums.RequestMethod;
import lombok.Data;

import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/9 23:53
 */
@Data
public class Endpoint {
   private String name;
   private RequestMethod requestMethod;
   private String baseURIName;
   private String URI;
   private List<Parameter> parameters;
   private List<Header> headers;
   private String payload;
   private String contentType = "JSON";
   private String authorization = "None";
   private DataLocator dataLocator;

}
