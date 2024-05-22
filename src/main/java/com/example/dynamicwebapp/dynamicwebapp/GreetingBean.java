package com.example.dynamicwebapp.dynamicwebapp;

import org.springframework.stereotype.Component;

@Component
public class GreetingBean {

    private String name = "Julian";
    int hour = java.time.LocalDateTime.now().getHour();

    public String getGreeting() {
        String greeting = "";

        if (hour < 12) {
            greeting = "Good morning";
        } else if (hour < 18) {
            greeting = "Good afternoon";
        } else {
            greeting = "Good evening";
        }
        return greeting + " " + name;
    }
}
