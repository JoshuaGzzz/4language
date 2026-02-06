/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.legendslangmunaangnakakaalam;
import java.util.Scanner;
/**
 *
 * @author Joshua Garcia
 */
public class Legendslangmunaangnakakaalam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***WELCOME TO THE CYBER-BAR***");
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        
        if (name.equals("Day6")) {
        System.out.println("Welcome " + name + ", the best kpop bg of all time!");
        } else {
            System.out.println("Welcome " + name + "!");
            System.out.println("****************************");
            System.out.println("Enter your age:");
            int age = scan.nextInt();

            if(age >= 18) {
                System.out.println("Welcome");
                System.out.println("****************************");
                System.out.println("Do you have a VIP pass?");
                String input = scan.nextLine();
                boolean VIP = scan.nextBoolean();

                if(VIP) {
                    System.out.println("Welcome");
                    System.out.println("How much money do you have?");
                    double money = scan.nextDouble();

                    if(money >= 49.99) {
                        System.out.println("Welcome");
                        double cost = 49.99;
                        double change = money - cost;

                        System.out.println("Your change is " + change);
                    } else {
                        System.out.println("LAYAS HAMPASLUPA");
                    }
                } else {
                    System.out.println("Welcome (non-VIP)");
                    System.out.println("How much money do you have?");
                    double money = scan.nextDouble();

                    if(money >= 69.67) {
                        System.out.println("Welcome");
                        double cost = 69.67;
                        double change = money - cost;
                        System.out.println("Your change is " + change);
                    } else {
                        System.out.println("LAYAS HAMPASLUPA");
                    }                    
                }
            }  else {
                System.out.println("You are not legally allowed to enter CYBER-BAR. SCRAM!");
            }   
        }
    }
}
