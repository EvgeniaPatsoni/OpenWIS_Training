package com.openwis.helloworld.controller;

import com.openwis.helloworld.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController
{
    HelloWorldService helloWorldService;

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    @GetMapping(path = "/sum/{num1}/{num2}")
    @ResponseBody
    public String getSum(@PathVariable int num1, @PathVariable int num2)
    {
        helloWorldService = new HelloWorldService();
        int theSum = helloWorldService.sumNumbers(num1,num2);
        return "The sum of the two numbers is: "+theSum;
    }
}
