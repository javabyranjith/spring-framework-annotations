package jbr.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredMethod {

  private Product product;

  private Fan fan;

  @Autowired
  private void setProduct(Product product) {
    System.out.println("AutowiredMethod.setProduct");
    this.product = product;
  }

  @Autowired
  private void fanMethod(Fan fan) {
    System.out.println("AutowiredMethod.fanMethod");
    this.fan = fan;
  }
}
