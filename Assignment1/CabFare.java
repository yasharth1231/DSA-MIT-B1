import java.util.Scanner;

public class CabFare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance: ");
        int distance = sc.nextInt();

        System.out.print("Night Ride (true/false): ");
        boolean night = sc.nextBoolean();

        double fare;

        if(distance <= 5) {
            fare = distance * 50;
        }
        else if(distance <= 10) {
            fare = 5 * 50 + (distance - 5) * 40;
        }
        else {
            fare = 5 * 50 + 5 * 40 + (distance - 10) * 30;
        }

        if(night) {
            fare = fare + fare * 0.20;
        }

        System.out.println("Fare = " + fare);
    }
}