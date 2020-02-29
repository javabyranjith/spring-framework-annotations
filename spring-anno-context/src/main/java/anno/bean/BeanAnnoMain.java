package anno.bean;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnoMain {

  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("context-anno-beans.xml");
    Room room = (Room) ctx.getBean("room");
    System.out.println(room.getTable().getName());
    
    Arrays.asList(ctx.getBeanDefinitionNames()).forEach(System.out::println);
  }

}
