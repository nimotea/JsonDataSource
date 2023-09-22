package json;

import json.common.Parameter;
import json.enums.DataLocatorType;
import json.enums.RequestMethod;
import lombok.Data;

import java.util.List;
import java.util.Map;

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
   private Map<String,Object> headers;
   private String payload;
   private String contentType = "JSON";
   private String authorization = "None";
   private DataLocator dataLocator = new DataLocator();

   public void setDataLocatorType(DataLocatorType type) {
      this.dataLocator.setType(type);
   }

   public void setDataLocatorJsonPath(String jsonPath){
      this.dataLocator.setValue(jsonPath);
   }

   public void setDataLocatorPreQuery(String preQuery){
      this.dataLocator.setValue(preQuery);
   }
}
