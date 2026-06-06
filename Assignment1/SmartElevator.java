import java.util.Scanner;

public class SmartElevator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Current Floor: ");
        int currentFloor = sc.nextInt();

        System.out.print("Request Floor 1: ");
        int req1 = sc.nextInt();

        System.out.print("Request Floor 2: ");
        int req2 = sc.nextInt();

        System.out.print("Elevator Overloaded (true/false): ");
        boolean overloaded = sc.nextBoolean();

        if (overloaded) {
            System.out.println("Elevator Cannot Move");
        }
        else {
            if (req1 > currentFloor) {
                System.out.println("Next Stop = " + req1);
            }
            else if (req2 > currentFloor) {
                System.out.println("Next Stop = " + req2);
            }
            else {
                System.out.println("Next Stop = " + req1);
            }
        }
    }
}