import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "admin";

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter Password: ");
            String password = sc.nextLine();

            if (password.equals(correctPassword)) {
                System.out.println("Login Successful");
                return;
            }
        }

        System.out.println("Account Locked");
    }
}