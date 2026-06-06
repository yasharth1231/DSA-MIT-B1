import java.util.Scanner;

public class TrainBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Available Seats: ");
        int seats = sc.nextInt();

        System.out.print("VIP Passenger (true/false): ");
        boolean vip = sc.nextBoolean();

        if(seats > 0 || vip) {
            System.out.println("Ticket Confirmed");
        }
        else {
            System.out.println("Waitlisted");
        }
    }
}