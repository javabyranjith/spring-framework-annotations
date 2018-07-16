package jbr.spring.anno.util;

import org.springframework.context.ApplicationContext;

public class SpringAnnoUtil {

  public static void printBeans(ApplicationContext ctx) {
    for (int i = 0; i < ctx.getBeanDefinitionCount(); i++) {
      System.out.println(ctx.getBeanDefinitionNames()[i]);
    }
  }
}
