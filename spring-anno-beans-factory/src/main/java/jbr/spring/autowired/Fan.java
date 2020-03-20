package jbr.spring.autowired;

import org.springframework.stereotype.Component;

@Component
public class Fan extends Product {

  public void name() {
    System.out.println("fan");
  }

}
