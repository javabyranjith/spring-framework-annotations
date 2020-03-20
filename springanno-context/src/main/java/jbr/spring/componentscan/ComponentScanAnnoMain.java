package jbr.spring.componentscan;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanAnnoMain {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigClass.class);
    Arrays.asList(ctx.getBeanDefinitionNames()).forEach(System.out::println);

    ctx.close();
  }

}
