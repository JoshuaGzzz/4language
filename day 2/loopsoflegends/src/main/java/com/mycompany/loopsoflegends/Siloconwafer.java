/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loopsoflegends;
import java.util.Scanner;
/**
 *
 * @author Joshua Garcia
 */
public class Siloconwafer {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wafer = 0;
        double impurity = 0;
        double accept = 0;
        double defect = 0;
        double maximp = 0;
        
        System.out.println("--- SILICON WAFER QC SYSTEM ---");
        while(true) {
            System.out.println("Enter impurity count (-1 TO STOP)");
            int number = scan.nextInt();
            
            if(number >= 0) {
                System.out.println("Recognized, continue to input of type -1 to stop");
                wafer++;
                impurity += number;
                
                if (maximp < number) {
                    maximp = number;
                }
                
               
                if(number % 2 == 0) {
                    accept++;
                    continue;
                } else{
                    defect++;
                    continue;
                }
                
            } else if(number < 0 && number != -1) {
                System.out.println("Error: Invalid Reading.");
                continue;
            } else if (number == -1) {
                break;
            }
         
        }
        
        double avg = impurity / wafer;
        System.out.println("--- BATCH SUMMARY ---");
        System.out.println("Total Wafers: " + wafer);
        System.out.println("Total Impurities: " + impurity);
        System.out.println("Average Impurity Level: " + avg);
        System.out.println("Highest impurity: " + maximp);
        System.out.println("Acceptable Wafers (Even): " + accept);
        System.out.println("Defective Wafers (Odd): " + defect);
        
        
       System.out.println("--- VISUAL DENSITY REPORT ---");
       System.out.println("Generating visual representation of " + wafer + " wafers");
       
       for(int i = 0; i < wafer; i++) {
           System.out.print("|");
       }
       System.out.println("\n");
       System.out.println("Shuting down"); 
    }
}
