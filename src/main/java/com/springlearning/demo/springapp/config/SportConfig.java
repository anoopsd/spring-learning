package com.springlearning.demo.springapp.config;

import com.springlearning.demo.springapp.common.Coach;
import com.springlearning.demo.springapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
