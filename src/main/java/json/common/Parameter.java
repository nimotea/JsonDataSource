package json.common;

import lombok.Data;

/**
 * @author hanzhou
 * date 2023/9/9 23:57
 */
@Data
public class Parameter {
    boolean isMultivalued;
    String delimiter;
    String name;
    String defaultValue;
    String dataType;
}
