package jbr.spring.anno.importresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ImportResource({ "import-resource-bean1.xml", "import-resource-bean2.xml"})
@PropertySource({"names.properties"})
public class ImportResourceAnnoMain {

  @Value("${name}")
  private String name;
  
  public String getName() {
    return name;
  }
  
  @Autowired
  private Father father;

  @Autowired
  private Son son;

  public Father getFather() {
    return father;
  }

  public Son getSon() {
    return son;
  }

  public static void main(String[] args) {
   // ImportResourceAnnoMain main = new ImportResourceAnnoMain();
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ImportResourceAnnoMain.class);
    ImportResourceAnnoMain main = (ImportResourceAnnoMain) ctx.getBean("importResourceAnnoMain");
    System.out.println(ctx.getBean("father").toString());
    System.out.println(main.getSon().toString());
    System.out.println(main.getName());
  }

}
