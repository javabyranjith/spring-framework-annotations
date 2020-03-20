package jbr.spring.component;

import org.springframework.stereotype.Component;

@Component()
public class Chair {

  private String name = "Chair Class";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}