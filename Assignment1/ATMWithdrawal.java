import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter Withdrawal Amount: ");
        int amount = sc.nextInt();

        if(balance < amount) {
            System.out.println("Transaction Failed: Insufficient Balance");
        }
        else if(balance - amount < 1000) {
            System.out.println("Transaction Failed: Minimum balance violation");
        }
        else {
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance = " + (balance - amount));
        }
    }
}