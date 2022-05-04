import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 100:");
        int num = Integer.valueOf(scanner.nextLine());

        if (num >= 90 && num <= 100) {
            System.out.println("Your grade is an A. :)");
        } else if (num >= 80 && num <= 89) {
            System.out.println("Your grade is an B. :)");
        } else if (num >= 70 && num <= 79) {
            System.out.println("Your grade is an C. :)");
        } else if (num >= 60 && num <= 69) {
            System.out.println("Your grade is an D. :)");
        } else if (num >= 0 && num <= 59) {
            System.out.println("Your grade is an F. :)");
        } else {
            System.out.println("The number is not in the range.");
        }
    }
}
