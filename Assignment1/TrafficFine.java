import java.util.Scanner;

public class TrafficFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Speed: ");
        int speed = sc.nextInt();

        System.out.print("Repeated Violation (true/false): ");
        boolean repeated = sc.nextBoolean();

        int fine = 0;

        if (speed > 100)
            fine = 1000;
        else if (speed > 80)
            fine = 500;

        if (repeated)
            fine *= 2;

        System.out.println("Fine = " + fine);
    }
}