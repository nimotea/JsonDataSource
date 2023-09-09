/**
 * @author hanzhou
 * date 2023/9/9 23:37
 */

/*
test post info

{
    "name":"测试json数据源",
    "provider":"Json",
    "connectionString":"SIP=\"0\";SourceType=\"Web\";WebConfigWithMultiBaseURI=\"{\"\"Authorizations\"\":[],\"\"BaseURIs\"\":[{\"\"Name\"\":\"\"测试基准地址\"\",\"\"URI\"\":\"\"https://jsonplaceholder.typicode.com\"\",\"\"Headers\"\":[{\"\"Key\"\":\"\"Header1\"\",\"\"Value\"\":\"\"14234235345634\"\"}],\"\"Parameters\"\":[{\"\"Name\"\":\"\"Parameter1\"\",\"\"DefaultValue\"\":\"\"2342\"\",\"\"DataType\"\":\"\"String\"\",\"\"IsMultivalued\"\":false,\"\"Delimiter\"\":\"\"\"\"},{\"\"Name\"\":\"\"Parameter2\"\",\"\"DefaultValue\"\":0,\"\"DataType\"\":\"\"Integer\"\",\"\"IsMultivalued\"\":false,\"\"Delimiter\"\":\"\"\"\"},{\"\"Name\"\":\"\"Parameter3\"\",\"\"DefaultValue\"\":\"\"32423\"\",\"\"DataType\"\":\"\"Float\"\",\"\"IsMultivalued\"\":true,\"\"Delimiter\"\":\"\",\"\"}]}],\"\"DataType\"\":\"\"JSON\"\",\"\"Endpoints\"\":[{\"\"Name\"\":\"\"posts\"\",\"\"URI\"\":\"\"/posts\"\",\"\"BaseURIName\"\":\"\"测试基准地址\"\",\"\"RequestMethod\"\":\"\"GET\"\",\"\"Authorization\"\":\"\"\"\",\"\"Headers\"\":[{\"\"Key\"\":\"\"Header2\"\",\"\"Value\"\":\"\"2342523\"\"}],\"\"Parameters\"\":[{\"\"Name\"\":\"\"Parameter4\"\",\"\"DefaultValue\"\":\"\"\"\",\"\"DataType\"\":\"\"String\"\",\"\"IsMultivalued\"\":false,\"\"Delimiter\"\":\"\"\"\"},{\"\"Name\"\":\"\"Parameter5\"\",\"\"DefaultValue\"\":\"\"\"\",\"\"DataType\"\":\"\"String\"\",\"\"IsMultivalued\"\":true,\"\"Delimiter\"\":\"\"\"\"}],\"\"Payload\"\":\"\"\"\",\"\"DataLocator\"\":{\"\"Type\"\":\"\"JsonPath\"\",\"\"Value\"\":\"\"$.[*]\"\"},\"\"ContentType\"\":\"\"JSON\"\",\"\"Id\"\":\"\"posts\"\"}]}\";SchemaDefinition={\"tables\":[{\"name\":\"posts\",\"columns\":[{\"columnName\":\"userId\",\"dataType\":\"System.Int64\",\"tableName\":\"posts\"},{\"columnName\":\"id\",\"dataType\":\"System.Int64\",\"tableName\":\"posts\"},{\"columnName\":\"title\",\"dataType\":\"System.String\",\"tableName\":\"posts\"},{\"columnName\":\"body\",\"dataType\":\"System.String\",\"tableName\":\"posts\"}]}]}",
    "useAdvancedConfig":true,
    "extractInDatabase":true,
    "mappingConfig":null
}
*/


public class TestCreatJSONDataSource {
    public static void main(String[] args) {

    }
}
