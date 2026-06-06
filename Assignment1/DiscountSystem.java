import java.util.Scanner;

public class DiscountSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Premium User (true/false): ");
        boolean premium = sc.nextBoolean();

        double discount = 0;

        if (amount >= 5000)
            discount = 20;
        else if (amount >= 3000)
            discount = 10;

        if (premium)
            discount += 5;

        double finalAmount = amount - (amount * discount / 100);

        System.out.println("Final Amount = " + finalAmount);
    }
}