package jbr.spring.anno.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {

  @Bean
  public List<String> animals() {
    return Arrays.asList(new String[] { "Lion", "Tiger", "Elephant" });
  }
  
}
