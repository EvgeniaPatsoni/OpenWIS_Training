package com.openwis.cicd.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.openwis.helloworld.controller"})
public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
