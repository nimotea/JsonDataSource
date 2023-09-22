package json;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/9 23:46
 */
@Data
public class WebConfigWithMultiBaseURI {
   private List<Object> authorizations = new ArrayList<>();
   private List<BaseURI> baseURIs = new ArrayList<>();
   private String DataType = "JSON";
   private List<Endpoint> endpoints = new ArrayList<>();

   public void addBaseURIS(BaseURI baseURI){
      this.baseURIs.add(baseURI);
   }

   public void addEndpoints(Endpoint endpoint){this.endpoints.add(endpoint);}
}
