import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number:");
        int second = Integer.valueOf(scanner.nextLine());
        double division = (double)first/(double)second;

        System.out.println(first + " + " + second + " = " + (first+second));
        System.out.println(first + " - " + second + " = " + (first-second));
        System.out.println(first + " * " + second + " = " + (first*second));
        System.out.println(first + " / " + second + " = " + division);
        System.out.println(first + " % " + second + " = " + (first%second));
    }
}
