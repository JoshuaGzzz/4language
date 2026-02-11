import java.util.Scanner;

public class exercise1GiftTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much did you spend on gifts?: "); //scanner start
        int giftExpense = scanner.nextInt(); //scanner detect
        if (giftExpense >= 5000 && giftExpense <= 24999) {
            double giftTax = ((giftExpense - 5000) * 0.08) + 100; //maths. can use double since decimal n shit
            double giftTotal = giftExpense + giftTax; //must be double at the end to avoid confusion
            System.out.println("That's under tier 1 tax: 100 + 8% of the amount over 5,000");
            System.out.println("Your tax will be " + giftTax + " and your total will be " + giftTotal);
        } else if (giftExpense >= 25000 && giftExpense <= 54999) {
            double giftTax = ((giftExpense - 25000) * 0.1) + 1700;
            double giftTotal = giftExpense + giftTax;
            System.out.println("That's under tier 2 tax: Tax is 1,700 + 10% of the amount over 25,000.");
            System.out.println("Your tax will be " + giftTax + " and your total will be " + giftTotal);
        } else if (giftExpense >= 55000) {
            double giftTax = ((giftExpense - 55000) * 0.12) + 4700;
            double giftTotal = giftExpense + giftTax;
            System.out.println("That's under tier 3 tax: Tax is 4,700 + 12% of the amount over 55,000.");
            System.out.println("Your tax will be " + giftTax + " and your total will be " + giftTotal);
        } else {
            System.out.println("Oki no tax thinz");
            System.out.println("Total: " + giftExpense);
        }
    }
}
