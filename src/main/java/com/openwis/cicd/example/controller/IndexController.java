package com.openwis.cicd.example.controller;

import com.openwis.cicd.example.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

  IndexService indexService;

  public IndexController(IndexService indexService) {
    this.indexService = indexService;
  }

  @Autowired

  @GetMapping("/hello")
  public String sayHello() {
    return "hello";
  }

  @GetMapping(path = "/sum/{num1}/{num2}")
  @ResponseBody
  public String getSum(@PathVariable int num1, @PathVariable int num2) {
    int theSum = indexService.sumNumbers(num1, num2);
    return "The sum of the two numbers is: " + theSum;
  }
}
