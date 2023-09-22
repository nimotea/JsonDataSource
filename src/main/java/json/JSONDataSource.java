package json;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import json.util.HttpUtil;
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

    @JSONField(serialize = false)
    private Connection connection = new Connection();

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
        this.connection.getWebConfigWithMultiBaseURI().addBaseURIS(baseURI);
    }

    public void addEndpoint(Endpoint endpoint){
        if (connection == null){
            this.connection = new Connection();
        }
        this.connection.getWebConfigWithMultiBaseURI().addEndpoints(endpoint);
    }

    public String getPostBody(){
        this.connectionString = connection.toString();
        JSONObject jsonDataSource = new JSONObject();
        jsonDataSource.put("name",name);
        jsonDataSource.put("provider",provider);
        jsonDataSource.put("connectionString",connectionString);
        jsonDataSource.put("useAdvancedConfig",useAdvancedConfig);
        jsonDataSource.put("extractInDatabase",extractInDatabase);
        jsonDataSource.put("mappingConfig",mappingConfig);
        testConnection(jsonDataSource.toJSONString());
        return jsonDataSource.toJSONString();
    }

    public void testConnection(String body){
    String LOCAL_CONNECTION_URL = "http://localhost:51980/api/datasource/schemadefinition?token=8FECF4F2D358B7EFC57CD4A92305677698217BE09EBE04D29A7418FCF4BF0B34";
        String result = HttpUtil.sendPostRequest(LOCAL_CONNECTION_URL,body);
        System.out.println(result);
    }

}
