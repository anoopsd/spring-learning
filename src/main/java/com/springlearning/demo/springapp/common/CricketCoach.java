package com.springlearning.demo.springapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "From Cricket Coach!!!!!@@@@";
    }

    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("Cricket Coach doMyStartupStuff");
    }

    @PreDestroy
    public void doMyShutdownStuff() {
        System.out.println("Cricket Coach doMyShutdownStuff");
    }
}
