package com.openwis.helloworld.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

  public int sumNumbers(int number1, int number2) {
    return number1 + number2;
  }
}
