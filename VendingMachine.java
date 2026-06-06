import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Chips Tray");
            System.out.println("2. Drinks Tray");
            System.out.println("3. Chocolate Tray");
            System.out.println("0. Exit");

            System.out.print("Select Tray: ");
            int tray = sc.nextInt();

            if (tray == 0) {
                System.out.println("Thank You!");
                break;
            }

            char ch; // Variable must be declared outside the do-while loop to be used in the condition
            boolean isValidTray = true;

            // Using do-while loop for the product selection
            do {
                switch (tray) {
                    case 1:
                        System.out.println("A. Lays");
                        System.out.println("B. Uncle Chips");
                        System.out.println("C. Doritos");
                        break;
                    case 2:
                        System.out.println("A. Coke");
                        System.out.println("B. Pepsi");
                        System.out.println("C. Sprite");
                        break;
                    case 3:
                        System.out.println("A. Dairy Milk");
                        System.out.println("B. KitKat");
                        System.out.println("C. Perk");
                        break;
                    default:
                        System.out.println("Invalid Tray");
                        isValidTray = false;
                        break;
                }

                // If tray is invalid, exit the loop immediately
                if (!isValidTray) {
                    break;
                }

                System.out.print("Select Product (A/B/C): ");
                char product = sc.next().charAt(0);
                System.out.println("Product Selected: " + product);

                System.out.print("Stay in same tray? (Y/N): ");
                ch = sc.next().charAt(0);

            } while (ch == 'Y' || ch == 'y'); // The loop continues ONLY if user enters Y or y
        }

        sc.close();
    }
}
