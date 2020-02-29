package jbr.spring.anno.profile;

import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class ProfileAnnoMain {

  private static final Logger log = Logger.getLogger(ProfileAnnoMain.class.getName());

  public static void main(String[] args) {

    ProfileAnnoMain main = new ProfileAnnoMain();
    main.annoContext();
    main.appContext();
  }

  public void annoContext() {
    // SET PROFILE WAY 1 - if nothing specified, 'default' will be picked
    // System.setProperty("spring.profiles.active", "manager");
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    // SET PROFILE WAY 2, multiple profiles can be set
    ctx.getEnvironment().setActiveProfiles("manager");
    ctx.register(ProfileAnnoMain.class);
    ctx.refresh();
    log.info("Beans Count: " + ctx.getBeanNamesForType(AccessService.class).length);
    log.info("Beans Name: " + ctx.getBeanNamesForType(AccessService.class)[0]);
    ctx.close();
  }

  public void appContext() {
    // if nothing specified, 'default' will be picked
    System.setProperty("spring.profiles.active", "employee");

    ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:context-anno-beans.xml");
    log.info("Beans Count: " + ctx.getBeanNamesForType(AccessService.class).length);
    log.info("Beans Name: " + ctx.getBeanNamesForType(AccessService.class)[0]);
  }
}
