package com.example.dynamicwebapp.dynamicwebapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @Autowired
    private GreetingBean greetingBean;

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("requestURI", "/welcome");
        model.addAttribute("protocol", "HTTP/1.1");
        model.addAttribute("remoteAddress", "127.0.0.1");
        model.addAttribute("randomNumber", Math.random());
        model.addAttribute("greeting", greetingBean.getGreeting());
        return "welcome";
    }
}
