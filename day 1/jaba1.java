import java.util.Scanner;

public class jaba1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner
        System.out.println("What is your name?: "); //name scanner
        String name = scanner.nextLine(); //get
        if (name.equals("tenz")) { //if else
            System.out.println("Hello " + name + "! How fast are you in car: "); //second scanner
            double speed = scanner.nextDouble(); //the cause of scanner above ^^^^
            if (speed >= 79.5 && speed <= 100.5) { //if else common sense na yan
                scanner.nextLine(); //only add this when transition from nextDouble to nextLine
                System.out.println("You are speeding, " + name + ", Slow down!");
                String ok = scanner.nextLine(); //scanner for string
                System.out.println(ok);
            } else if (speed > 100.5) {
                System.out.println("KAMATAYAN MO NA " + name + "!");  
                double lmao = scanner.nextDouble(); //this stays the same since its still double. if cut by the if else so we chill
                System.out.println(lmao);  
            } else {
                System.out.println("You are within the speed limit, " + name + ". Keep it up!");
            }
        } else {
            System.out.println("Hello " + name + "! You are not tenz, access denied.");
        }
    }
}