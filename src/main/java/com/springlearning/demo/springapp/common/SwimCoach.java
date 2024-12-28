package com.springlearning.demo.springapp.common;

public class SwimCoach implements  Coach{

    @Override
    public String getDailyWorkout() {
        return "Swim up coach";
    }
}
