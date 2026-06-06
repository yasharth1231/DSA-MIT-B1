import java.util.Scanner;

public class ReturnPolicy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Days Since Purchase: ");
        int days = sc.nextInt();

        System.out.print("Defective Product (true/false): ");
        boolean defective = sc.nextBoolean();

        System.out.print("Premium User (true/false): ");
        boolean premium = sc.nextBoolean();

        boolean accepted = false;

        if (defective) {
            accepted = true;
        }
        else if (premium && days <= 15) {
            accepted = true;
        }
        else if (days <= 7) {
            accepted = true;
        }

        if (accepted) {
            System.out.println("Return Accepted");
        } else {
            System.out.println("Return Rejected");
        }
    }
}