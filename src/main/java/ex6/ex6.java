package ex6;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Calendar;
import java.util.Scanner;
import java.util.Calendar;
//What is your current age? 25
//At what age would you like to retire? 65
//You have 40 years left until you can retire.
//It's 2015, so you can retire in 2055.
public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int age = scanner.nextInt();

        System.out.print("At what age would you like to retire? ");
        int retirementAge = scanner.nextInt();
        int retireIn = retirementAge - age;
        System.out.println("You have "+(retireIn) +" years left until you can retire.");
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("It's "+ currentYear +", so you can retire in "+ (currentYear + retireIn)+".");

    }
}
