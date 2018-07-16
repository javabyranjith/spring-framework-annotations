package jbr.spring.anno.importresource.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import jbr.spring.anno.importresource.Father;
import jbr.spring.anno.importresource.Son;

@Configuration
@ImportResource({ "import-resource-bean1.xml", "import-resource-bean2.xml" })
public class ImportResourceAnnoTest {

  AnnotationConfigApplicationContext ctx;

  @Before
  public void init() throws Exception {
    ctx = new AnnotationConfigApplicationContext(ImportResourceAnnoTest.class);
  }

  @Test
  public void test() {
    System.out.println(ctx.getBean(Father.class));
    System.out.println(ctx.getBean(Son.class));
  }

  @After
  public void destroy() throws Exception {
    ctx.close();
  }
}
