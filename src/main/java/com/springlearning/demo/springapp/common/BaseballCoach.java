package com.springlearning.demo.springapp.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice for Baseball Coach";
    }
}
