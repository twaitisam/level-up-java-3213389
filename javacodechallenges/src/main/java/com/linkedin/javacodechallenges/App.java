package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person("Sam", "Twaiti", 33);
        Person p2 = new Person("Imran", "Twaiti", 6);
        Person p3 = new Person("Rahaf", "Twaiti", 4);

        p1.introduceYourSelf();
        p2.introduceYourSelf();
        p3.introduceYourSelf();
    }
}
