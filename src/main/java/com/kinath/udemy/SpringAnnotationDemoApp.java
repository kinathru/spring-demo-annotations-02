package com.kinath.udemy;

import com.kinath.udemy.coach.WushuCoach;
import com.kinath.udemy.config.SportsConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemoApp
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext( SportsConfig.class );

        WushuCoach wushuCoach = context.getBean( "wushuCoach", WushuCoach.class );
        System.out.println( wushuCoach.getDailyWorkout() );
        System.out.println( wushuCoach.getFortune() );
        System.out.println( wushuCoach.getEmail() );
        System.out.println( wushuCoach.getTeam() );

        context.close();
    }
}
