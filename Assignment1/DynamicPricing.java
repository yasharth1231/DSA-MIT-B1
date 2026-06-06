import java.util.Scanner;

public class DynamicPricing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Base Price: ");
        double price = sc.nextDouble();

        sc.nextLine();

        System.out.print("Demand (High/Low): ");
        String demand = sc.nextLine();

        System.out.print("Weekend (true/false): ");
        boolean weekend = sc.nextBoolean();

        if (demand.equalsIgnoreCase("High")) {
            price = price + (price * 0.20);
        }

        if (weekend) {
            price = price + (price * 0.10);
        }

        System.out.println("Final Price = " + price);
    }
}