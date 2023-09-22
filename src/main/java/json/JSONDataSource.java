package json;


import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.NonNull;

/**
 * @author hanzhou
 * date 2023/9/9 23:41
 */
@Data
public class JSONDataSource {

    @NonNull
    private String name;
    @NonNull
    private String provider = "Json";
    @NonNull
    private String connectionString;
    @NonNull
    private boolean useAdvancedConfig = true;
    private boolean extractInDatabase = true;
    private Object mappingConfig = null;
    private Connection connection = null;

    public JSONDataSource() {
        this.connectionString = null;
        this.name = null;
    }


    public void createJsonDataSourceByMultiWebConfig(WebConfigWithMultiBaseURI webConfigWithMultiBaseURI){
        if (connection == null){
            connection = new Connection();
        }
        connection.setWebConfigWithMultiBaseURI(webConfigWithMultiBaseURI);
    }

    public void addBaseURI(BaseURI baseURI){
        if (connection == null){
            this.connection = new Connection();
        }
        createJsonDataSourceByMultiWebConfig(new WebConfigWithMultiBaseURI());
        this.connection.getWebConfigWithMultiBaseURI().addBaseURIS(baseURI);
    }

    public void addEndpoint(Endpoint endpoint){
        if (connection == null){
            this.connection = new Connection();
        }
        this.connection.getWebConfigWithMultiBaseURI().addEndpoints(endpoint);
    }

    public String getPostBody(){
        return JSON.toJSONString(this);
    }

}
