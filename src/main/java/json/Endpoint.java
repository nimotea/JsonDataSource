package json;

import com.alibaba.fastjson.annotation.JSONField;
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
   @JSONField(name = "Name")
   private String name;

   @JSONField(name = "RequestMethod")
   private RequestMethod requestMethod;

   @JSONField(name = "BaseURIName")
   private String baseURIName;

   @JSONField(name = "URI")
   private String URI;

   @JSONField(name = "Parameters")
   private List<Parameter> parameters;

   @JSONField(name = "Headers")
   private Map<String,Object> headers;

   @JSONField(name = "Payload")
   private String payload;

   @JSONField(name = "ContentType")
   private String contentType = "JSON";

   @JSONField(name = "Authorization")
   private String authorization = "None";

   @JSONField(name = "DataLocator")
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
