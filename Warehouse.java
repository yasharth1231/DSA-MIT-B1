
import java.util.Scanner;

public class Warehouse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of products (n): ");
        int n = scanner.nextInt();

        int restockCount = 0; 
        int count = 1;        

        while (count <= n) {
            System.out.println("\n--- Product " + count + " ---");
            
            System.out.print("Enter current stock: ");
            int currentStock = scanner.nextInt();

            System.out.print("Enter minimum required stock: ");
            int minRequired = scanner.nextInt();

            if (currentStock < minRequired) {
                int requiredQuantity = minRequired - currentStock;
                System.out.println("Restock needed for product " + count);
                System.out.println("Required quantity to refill: " + requiredQuantity);
                
              restockCount++;
            } else {
                System.out.println("Stock is sufficient for product " + count);
            }

            count++;
        }

        System.out.println("Total number of products that need to restock: " + restockCount);

        scanner.close();
    }
}
