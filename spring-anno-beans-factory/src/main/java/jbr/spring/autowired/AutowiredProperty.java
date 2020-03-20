package jbr.spring.autowired;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredProperty {

  @Autowired
  private Product[] productsArray;

  @Autowired
  private List<Product> productList;

  public void getProductsArray() {
    System.out.println("\nAutowiredProperty.getProductsArray()");
    Arrays.asList(productsArray).forEach(System.out::println);
  }

  public void getProductsList() {
    System.out.println("\nAutowiredProperty.getProductsList()");
    productList.forEach(System.out::println);
  }

}