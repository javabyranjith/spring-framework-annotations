package jbr.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import jbr.spring.model.Person;

@Controller
public class AnnoController {

  @Autowired
  private List<String> animals;

  @GetMapping("/")
  public String show(@ModelAttribute("person") Person person, Model model) {
    model.addAttribute("message", animals.get(0));

    return "hello";
  }

  @ModelAttribute("cities")
  public List<String> initializeCountries() {
    List<String> countries = new ArrayList<>();
    countries.add("India");
    countries.add("US");
    countries.add("China");

    return countries;
  }
}
