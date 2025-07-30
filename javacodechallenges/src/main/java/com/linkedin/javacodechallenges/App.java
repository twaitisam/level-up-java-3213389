package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
        double minCharge = 18.84; // price for the included gollans "2 CCF"
        double OneCCF = 748; // number of gollans in a CCF
        double TwoCCF = OneCCF * 2; // number of the included gollans

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
