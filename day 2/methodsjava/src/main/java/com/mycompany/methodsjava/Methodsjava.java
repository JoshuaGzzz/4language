/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodsjava;
import java.util.Scanner;
/**
 *
 * @author Joshua Garcia
 */
public class Methodsjava {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello World!");
        System.out.println("How racist r u rn from 1-10: ");
        int niggerno = scan.nextInt();
        
        
        nigger(niggerno); // dont put int in nigger no coz it creates new int for method but we want same int so its badbad
     
    }
    
    public static void nigger(int niggerno) {
            if (niggerno == 0) {
                while(true) {
                System.out.println("NIGGER");
                }
            } else {
                for(int i = 0; i < niggerno; i++) {
                System.out.println("NIGGER");      
            }
        }
    }
}
