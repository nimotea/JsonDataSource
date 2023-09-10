package json;

import lombok.Data;

import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/10 0:18
 */
@Data
public class SchemaDefinition {
    List<Table> tables;
}
