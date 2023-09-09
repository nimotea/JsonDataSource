package json;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/9 23:46
 */
public class WebConfigWithMultiBaseURI {
    List<Object> authorizations = new ArrayList<>();
    List<BaseURI> baseURIs;
    String DataType = "JSON";
    List<Endpoint> endpoints;
}
