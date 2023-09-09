package json.enums;

/**
 * @author hanzhou
 * date 2023/9/10 0:14
 */
public enum DataLocatorType {

    JsonPath("JsonPath"),
    PreQuery("PreQuery");

    private String typeName;

    DataLocatorType(String typeName){
        this.typeName = typeName;
    }

    public String getValue(){
     return this.typeName;
    }

}
