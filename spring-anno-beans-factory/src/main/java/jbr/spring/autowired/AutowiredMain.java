package jbr.spring.autowired;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredMain {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("jbr.spring.anno.autowired");
    ctx.getBean(Order.class).getProduct();
    ctx.getBean(AutowiredProperty.class).getProductsArray();
    ctx.getBean(AutowiredProperty.class).getProductsList();
    ctx.getBean(AutowiredConstructor.class);
    ctx.getBean(AutowiredMethod.class);

    ctx.close();
  }

}
