package com.linkedin.javacodechallenges;

import java.time.DateTimeException;
import java.time.LocalDate;

public class App 
{
    // Create function to calculate the date that's 
    // 100 days from now

    public static void main( String[] args )
    {
        LocalDate day = LocalDate.now().plusDays(100);
        System.out.println("100 days from now is... " + day);
    }
}
