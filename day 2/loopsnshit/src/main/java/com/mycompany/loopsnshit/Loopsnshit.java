/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loopsnshit;
import java.util.Scanner;
/**
 *
 * @author Joshua Garcia
 */
public class Loopsnshit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        System.out.println("****AUTISM TEST***");
        int attempt = 0;
        while(true) {
            System.out.println("Press 0 to break the fucking loop");
            int number = scan.nextInt();
            
            if(number == 0) {
                break;
            } else {
                System.out.println("BOBO ULET");
                attempt = attempt + 1;
                continue;
            }
        }
        System.out.println("You fucking made it autistic shit");
        System.out.println("Total: " + attempt);
    }
}
