package com.at.springbootactuator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("")
  public String home() {
    return "Hello from Spring Boot";
  }

}
