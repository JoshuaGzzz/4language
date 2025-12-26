import java.util.Scanner;

public class exercise2LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner start
        System.out.print("Enter a year: "); //scanner detect
        int year = scanner.nextInt(); //scanner onto variable
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //very long logic practice if else && is and || is or and % is modulo
            System.out.println("It is a leap year");
        } else {
            System.out.println("It's not a leap year");
        }

    }
}
