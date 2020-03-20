package jbr.spring.componentscan;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanAnnoMain2 {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    Arrays.asList(ctx.getBeanDefinitionNames()).forEach(System.out::println);

    ctx.close();
  }

}
