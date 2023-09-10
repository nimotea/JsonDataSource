package json;

import json.common.Header;
import json.common.Parameter;
import lombok.Data;

import java.net.URI;
import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/9 23:49
 */
@Data
public class BaseURI {
    String name;
    URI uri;
    List<Parameter> parameters;
    List<Header> headers;
}
