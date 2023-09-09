package json.enums;


/**
 * @author hanzhou
 * date 2023/9/10 0:03
 */
public enum RequestMethod {
    GET("GET"),
    POST("POST");

    private String method;
    RequestMethod(String method){
        this.method = method;
    }

    public String getValue(){
        return this.method;
    }
}
