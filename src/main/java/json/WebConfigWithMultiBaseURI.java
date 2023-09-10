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
   private List<BaseURI> baseURIs;
   private String DataType = "JSON";
   private List<Endpoint> endpoints;
}
