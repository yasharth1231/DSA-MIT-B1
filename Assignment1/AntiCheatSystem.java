import java.util.Scanner;

public class AntiCheatSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tab Switch Count: ");
        int tabSwitch = sc.nextInt();

        System.out.print("Idle Time (minutes): ");
        int idleTime = sc.nextInt();

        if (tabSwitch > 3 || idleTime > 5) {
            System.out.println("Cheating Suspected");
        } else {
            System.out.println("No Cheating Detected");
        }
    }
}