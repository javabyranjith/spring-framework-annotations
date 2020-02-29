package jbr.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfig {
  
  @Bean
  public Address addrBean() {
    Address addr = new Address();
    addr.setStreet("Gandhi Street");
    return addr;
  }
}
