package jbr.spring.anno.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Status {

  @Autowired
  public Status() {
    System.out.println("status no-arg constructor!!");
  }
}
