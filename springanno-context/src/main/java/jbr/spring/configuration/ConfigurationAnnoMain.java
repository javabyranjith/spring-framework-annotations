package jbr.spring.configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

public class ConfigurationAnnoMain {

  public static void main(String[] args) {

    /**
     * with @Import(value = { AddressConfig.class })
     */
    // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PersonConfig.class);
    
    /**
     * without @Import(value = { AddressConfig.class })
     */
    // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(PersonConfig.class, AddressConfig.class);
    
    
    // new MainConfig
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
    
    Person p = ctx.getBean(Person.class);
    Address addr = ctx.getBean(Address.class);

    System.out.println("Name: " + p.getName() + "\nAddress: " + addr.getStreet());
  }

}