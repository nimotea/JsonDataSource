package json;

import lombok.Data;

/**
 * @author hanzhou
 * date 2023/9/10 0:20
 */
@Data
public class Column {
   private String columnName;
   private String dataType;
   private String tableName;
}
