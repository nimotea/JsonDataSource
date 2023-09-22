package json;

import com.alibaba.fastjson.annotation.JSONField;
import json.enums.DataLocatorType;
import lombok.Data;

/**
 * @author hanzhou
 * date 2023/9/10 0:13
 */
@Data
public class DataLocator {
   @JSONField (name = "Type")
   private DataLocatorType type;
   @JSONField (name = "Value")
   private String value;
}
