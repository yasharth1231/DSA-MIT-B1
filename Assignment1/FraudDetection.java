import java.util.Scanner;

public class FraudDetection {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Location Match (true/false): ");
        boolean locationMatch = sc.nextBoolean();

        System.out.print("Transactions in 1 minute: ");
        int transactions = sc.nextInt();

        if ((amount > 50000 && !locationMatch) || transactions > 3) {
            System.out.println("Fraud Detected");
        } else {
            System.out.println("Transaction Safe");
        }
    }
}