package json;

import lombok.Data;

import java.util.List;

/**
 * @author hanzhou
 * date 2023/9/10 0:19
 */
@Data
public class Table {
    String name;
    List<Column> columns;
}
