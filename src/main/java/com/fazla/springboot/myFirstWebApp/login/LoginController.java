package com.fazla.springboot.myFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    //   http://localhost:8080/login?name=fazla
    @RequestMapping("/login")
    public String login(@RequestParam String name, ModelMap modelMap){
        modelMap.put("name",name);
        return "login";
    }
}
