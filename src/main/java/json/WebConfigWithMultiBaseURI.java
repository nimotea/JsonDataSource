package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/9 23:46
 */
@Data
public class WebConfigWithMultiBaseURI {
   @JSONField(name = "Authorizations")
   private List<Object> authorizations = new ArrayList<>();

   @JSONField(name = "BaseURIs")
   private List<BaseURI> baseURIs = new ArrayList<>();

   @JSONField(name = "DataType")
   private String DataType = "JSON";

   @JSONField(name = "Endpoints")
   private List<Endpoint> endpoints = new ArrayList<>();

   public void addBaseURIS(BaseURI baseURI){
      this.baseURIs.add(baseURI);
   }

   public void addEndpoints(Endpoint endpoint){this.endpoints.add(endpoint);}

   public String toString(){
      return JSON.toJSONString(this).replace("\"","\"\"");
   }
}
