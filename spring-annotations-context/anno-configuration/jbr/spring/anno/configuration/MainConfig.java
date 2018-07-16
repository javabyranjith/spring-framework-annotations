package jbr.spring.anno.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { PersonConfig.class, AddressConfig.class })
public class MainConfig {

}
