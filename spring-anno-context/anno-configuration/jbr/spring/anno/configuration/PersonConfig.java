package jbr.spring.anno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(value = { AddressConfig.class })
public class PersonConfig {

  @Bean
  public Person personBean() {

    Person per = new Person();
    per.setName("Ranjith");
    per.setAddress("chennai");
    per.setPhone("949494");

    return per;
  }
}
