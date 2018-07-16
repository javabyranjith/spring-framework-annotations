package jbr.spring.anno.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Payment {

  @Autowired
  public void getPay() {
    System.out.println("payment getPay method!!");
  }
}
