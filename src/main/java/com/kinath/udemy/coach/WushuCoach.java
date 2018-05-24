package com.kinath.udemy.coach;

import com.kinath.udemy.service.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class WushuCoach implements Coach
{
    private FortuneService fortuneService;

    @Value("${foo.team}")
    private String team;

    @Value("${foo.email}")
    private String email;

    public WushuCoach( FortuneService fortuneService )
    {
        this.fortuneService = fortuneService;
    }

    public String getFortune()
    {
        return fortuneService.getFortune();
    }

    public String getDailyWorkout()
    {
        return "Practice 1000 punches in the morning";
    }

    public String getTeam()
    {
        return team;
    }

    public void setTeam( String team )
    {
        this.team = team;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }
}
