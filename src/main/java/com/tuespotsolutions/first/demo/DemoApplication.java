package com.tuespotsolutions.first.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}

@RestController
class HelloController
{
    @RequestMapping("/hello")
    String hello()
    {
        return "Hello Tuespot";
    }

    @RequestMapping("/ravinder")
    String ravinder()
    {
        return "hello ravinder";
    }
}
