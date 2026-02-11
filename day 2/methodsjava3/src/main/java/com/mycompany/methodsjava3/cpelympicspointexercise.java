/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodsjava3;
import java.util.Scanner;
/**
 *
 * @author Joshua Garcia
 */
public class cpelympicspointexercise {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- CpElympics 5.0 Dashboard ---");
            System.out.println("Select: [1] Scores [2] Points [3] Podium [4] Exit");
            int select = scan.nextInt();

            if (select == 1){
                scores(scan);
            } else if (select == 2){
                System.out.println("How many wins?(-1 to go back): ");
                int wins = scan.nextInt();
                if (wins == -1){
                    continue;
                }
                System.out.println("How many Losses?: ");
                int lose = scan.nextInt();
                if (lose == -1){
                    continue;
                }               
                System.out.println("How many Draws?: ");
                int draws = scan.nextInt();      
                if (draws == -1){
                    continue;
                }                
                points(wins, lose, draws);
            } else if (select == 3){
                System.out.println("How many wins do you have?: ");
                int winstar = scan.nextInt();
                podium(winstar);
            } else if (select == 4){
                exit();
            }
        }

        
    }
    public static void scores(Scanner scan) {
        while (true) { //dinaya mo to pero bonak ka kase. kumbaga looping the entire code allows you to have control sa if else after breaking sa nested while loop coz pag nag break sa unang while loop may while naman ang main babalik lang siya
            int sum = 0;
            int count = 0;
            while (count < 5) {
                System.out.println("\nPlease input the scores (-1 to stop and -100 to go back)");
                int scoreno = scan.nextInt();

                if (scoreno >= 0 && scoreno != -1 && scoreno <= 10){
                    count++;
                    sum += scoreno;
                    System.out.println("Current Score: " + sum);
                    System.out.println("Current count: " + count + "/5");
                    continue;
                } else if (scoreno < -1 && scoreno != -100){
                    System.out.println("INVALID SCORE");
                    continue;
                } else if (scoreno == -1){
                    break;   
                } else if (scoreno == -100){
                    return;
                } else {
                    System.out.println("INVALID SCORE");
                    continue;
                }
            }
            if (count == 0){
                System.out.println("gago ka? ulet.");
            } else  {
                double sumd = sum; //dinaya mo to tandaan mo nalang
                double countd = count; //dinaya mo to tandaan mo nalang
                double avg = sumd/countd; 
                System.out.println("Total Score: " + sum);
                System.out.println("Total Count: " + count);
                System.out.printf("Average: %.2f", avg);   //dinaya mo to tandaan mo nalang //very fucking useful in the concept of placeholders reduces the string + variable
                break;       
            }
        }
    }
    
    public static void points(int wins, int lose, int draws) {
            int winpt = wins * 3;
            int losept = lose * 0;
            int drawpt = draws * 1;
            int totalpt = winpt + losept + drawpt;
            System.out.println("Total win points: " + winpt);
            System.out.println("Total lose points: " + losept);
            System.out.println("Total draw points: " + drawpt); 
            System.out.println("Total points: " + totalpt);  
            if (totalpt > 10) {
                System.out.println("QUalified for finals");
            }
        
    }
    
    public static void podium(int winstar) {
        for (int i = 1; i <= winstar; i++ ) { //horizontal
            for (int j = 1; j <= winstar; j++) { //vertical 
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for (int i = 1; i <= winstar; i++ ) { //horizontal
            for (int j = 1; j <= i; j++) { //switching the winstar to i makes it so where it follows i's amount of rows converted to column 
                System.out.print("*");
            }
            System.out.println();
        }

        
        for (int i = 1; i <= winstar; i++ ) { 
            for (int j = i; j <= winstar; j++) { //switching the 1 to i makes it so 
                System.out.print("*");
            }
            System.out.println();
        }
        

        

    }
    
    public static void exit() {
        System.out.println("Thank you for using the dashboard!");
        System.out.println("*******Now Exiting********");
        System.exit(0);
        }
    }