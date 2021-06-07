package org.example;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class Exercise06
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Calendar c = new GregorianCalendar();
        c.setTime(new Date());
        int currentAge, retirementAge, yearsLeft, currentYear = c.get(c.YEAR);

        System.out.print( "What is your current age? ");
        currentAge = sc.nextInt();
        System.out.print("What is your retirement age? ");
        retirementAge = sc.nextInt();
        yearsLeft = retirementAge - currentAge;
        System.out.printf("You have %d years left until you can retire.\n", yearsLeft);
        System.out.printf("It's %d, so you can retire in %d.", currentYear, currentYear+yearsLeft);



    }
}
