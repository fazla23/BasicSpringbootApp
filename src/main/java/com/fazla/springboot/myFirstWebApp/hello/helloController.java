package com.fazla.springboot.myFirstWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {

    @RequestMapping("/say-hello")
    public String sayHello(){
        return "hello";
    }
}
