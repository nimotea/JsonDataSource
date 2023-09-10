package json;

import json.enums.DataLocatorType;
import lombok.Data;

/**
 * @author hanzhou
 * date 2023/9/10 0:13
 */
@Data
public class DataLocator {
   private DataLocatorType type;
   private String value;
}
