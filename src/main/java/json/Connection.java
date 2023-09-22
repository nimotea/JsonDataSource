package json;

import lombok.Data;

/**
 * @author hanzhou
 * date 2023/9/9 23:44
 */
@Data
public class Connection {
   private String SIP = "0";
   private String SourceType = "Web";
   private WebConfigWithMultiBaseURI webConfigWithMultiBaseURI = new WebConfigWithMultiBaseURI();
   private SchemaDefinition schemaDefinition = new SchemaDefinition();


   public String toString() {
      System.out.println("webConfig");
      System.out.println(webConfigWithMultiBaseURI.toString());
      return String.format("SIP=\"%s\";SourceType=\"%s\";WebConfigWithMultiBaseURI=\"%s\"",
              SIP,
              SourceType,
              webConfigWithMultiBaseURI.toString()
      );
   }
}
