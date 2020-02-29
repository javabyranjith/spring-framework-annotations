package anno.bean;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * NO NEED 1) @ComponentScan annotation 2) ctx.register(BeanAnnoMain.class) 3)
 * ctx.refresh();
 */
public class BeanAnnoMainPackName {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("jbr.spring.anno.bean");
    //Room room = (Room) ctx.getBean("room");
    Room room = ctx.getBean(Room.class);
    System.out.println(room.getLight().getName());
    ctx.close();
    
    Arrays.asList(ctx.getBeanDefinitionNames()).forEach(System.out::println);
  }

}
