package jbr.spring.anno.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class TableMain {

  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:stereotype-anno-beans.xml");

    /**
     * when @Component("tableBean")
     */
    //Table table = (Table) ctx.getBean("tableBean"); // 
    
    /**
     * @Component
     */
    // Table table = (Table) ctx.getBean("table"); // when 
    
    Table table = ctx.getBean(Table.class);
    
    System.out.println(table.getName());
  }
}
