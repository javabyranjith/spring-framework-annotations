package jbr.spring.anno.autowired;

import org.springframework.stereotype.Component;

@Component
public class Mobile extends Product {

  public void name() {
    System.out.println("mobile");
  }

}
