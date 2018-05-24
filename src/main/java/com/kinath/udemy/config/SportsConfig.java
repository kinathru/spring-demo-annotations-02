package com.kinath.udemy.config;

import com.kinath.udemy.coach.Coach;
import com.kinath.udemy.coach.WushuCoach;
import com.kinath.udemy.service.CustomFortuneService;
import com.kinath.udemy.service.FortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
public class SportsConfig
{
    @Bean
    public FortuneService customFortuneService()
    {
        return new CustomFortuneService();
    }

    @Bean
    public Coach wushuCoach()
    {
        return new WushuCoach( customFortuneService() );
    }
}
