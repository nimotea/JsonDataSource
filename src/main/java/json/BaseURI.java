package json;

import com.alibaba.fastjson.annotation.JSONField;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import json.common.Parameter;
import lombok.Data;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/**
 * @author hanzhou
 * date 2023/9/9 23:49
 */
@Data
public class BaseURI {
    @JSONField(serialize = false)
    private Logger logger = LoggerFactory.getLogger(BaseURI.class);

    @JSONField(name = "Name")
    private String name;

    @JSONField(name = "URI")
    private URI uri;

    @JSONField(name = "Parameters")
    private List<Parameter> parameters;

    @JSONField(name = "Headers")
    private Map<String,Object> headers;

    public void setUri(String uri)  {
        try {
            this.uri = new URI(uri);
        }catch (URISyntaxException e){
            logger.error("URI非标准规范 : {}",uri,e);
        }
    }

    public void setHeaderValue(String key,Object value){
        this.headers.put(key,value);
    }
}
