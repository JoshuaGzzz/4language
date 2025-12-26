import java.util.Scanner;

public class jaba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scanner.nextLine();
        if (name.equals("tenz")) {
            System.out.println("Hello " + name + "! How fast are you in car: ");
            double speed = scanner.nextDouble();
            if (speed >= 79.5 && speed <= 100.5) {
                System.out.println("You are speeding, " + name + ", Slow down!");
            } else if (speed > 100.5) {
                System.out.println("KAMATAYAN MO NA " + name + "!");    
            } else {
                System.out.println("You are within the speed limit, " + name + ". Keep it up!");
            }
        } else {
            System.out.println("Hello " + name + "! You are not tenz, access denied.");
        }
    }
}