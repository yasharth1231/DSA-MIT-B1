import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Subject 1 marks: ");
        double marks1 = scanner.nextDouble();
        System.out.print("Enter Subject 1 weight (e.g., 0.4): ");
        double weight1 = scanner.nextDouble();

        System.out.print("Enter Subject 2 marks: ");
        double marks2 = scanner.nextDouble();
        System.out.print("Enter Subject 2 weight (e.g., 0.3): ");
        double weight2 = scanner.nextDouble();

        System.out.print("Enter Subject 3 marks: ");
        double marks3 = scanner.nextDouble();
        System.out.print("Enter Subject 3 weight (e.g., 0.3): ");
        double weight3 = scanner.nextDouble();

        double finalScore = (marks1 * weight1) + (marks2 * weight2) + (marks3 * weight3);
        System.out.printf("\nFinal Weighted Score: %.2f\n", finalScore);

        char grade;
        if (finalScore >90) {
            System.out.println("Grade A");
        } else if (finalScore >80) {
            System.out.println("Grade B");
        } else if (finalScore >70) {
            System.out.println("Grade C");
        } else if (finalScore >60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }

        scanner.close();
    }
}
