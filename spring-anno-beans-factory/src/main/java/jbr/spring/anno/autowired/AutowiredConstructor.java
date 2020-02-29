package jbr.spring.anno.autowired;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredConstructor {

  private List<Product> prod;

  /**
   * if you have only a single constructor, Spring will automatically use that
   * 
   * @param prod
   */
  @Autowired // - wil work after commented also
  public void ProductConstructor(List<Product> prod) {
    this.prod = prod;
    System.out.println("\nAutowiredConstructorr CONSTRUCTOR");
    Arrays.asList(prod).forEach(System.out::println);
  }
}