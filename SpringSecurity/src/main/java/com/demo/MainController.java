package com.demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String hello(){
        return "Spring Security";
    }

    @RequestMapping("/protected")
    public String protectedHello(){
        return "Welcome User";
    }

    @RequestMapping("/admin")
    public String admin(){
        return "Welcome Admin";
    }

}