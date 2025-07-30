package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double minCharge = 18.84;
        double OneCCF = 748;
        double TwoCCF = OneCCF * 2;

        if(gallonsUsage > TwoCCF){
            double extraGollons = gallonsUsage - TwoCCF;
            double billPrice = Math.ceil(extraGollons / OneCCF) * 3.90;
            return billPrice + minCharge;
        }
        else{
            return minCharge;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
