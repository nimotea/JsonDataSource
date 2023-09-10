package json;


import lombok.Data;

/**
 * @author hanzhou
 * date 2023/9/9 23:41
 */
@Data
public class JSONDataSource {

    String name;
    String provider = "Json";
    String connectionString;
    boolean useAdvancedConfig = true;
    boolean extractInDatabase = true;
    Object mappingConfig =null;
    Connection connection;

}
