package jbr.spring.anno.componentscan.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

  public String dao() {
    return "DAO";
  }
}
