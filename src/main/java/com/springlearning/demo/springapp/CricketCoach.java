package com.springlearning.demo.springapp;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "From Cricket Coach ";
    }
}
